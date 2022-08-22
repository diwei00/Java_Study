import java.util.Arrays;
import java.util.Comparator;

class Person8 implements Comparable<Person8>{
    public int age;
    public String name;
    public Person8(int age, String name) {
        this.age = age;
        this.name= name;
    }

    @Override
    public String toString() {
        return "Person8{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    public int compareTo(Person8 o) {
        return this.age - o.age;

    }
}
//比较器
class AgeComparator implements Comparator<Person8>{
    @Override
    public int compare(Person8 o1, Person8 o2) {
        return o1.age - o2.age;
    }
}
class NameComparator implements Comparator<Person8> {
    @Override
    public int compare(Person8 o1, Person8 o2) {
        return o1.name.compareTo(o2.name);
    }
}
public class Test18 {
    public static void bubbleSort(Comparable[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j].compareTo(arr[j + 1]) > 0) {
                    Comparable tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Person8[] stu = {new Person8(21,"ww"), new Person8(18,"aa"),new Person8(25,"bb")};
        //
        AgeComparator AgeComparator = new AgeComparator();
        NameComparator NameComparator = new NameComparator();


        Arrays.sort(stu);
        Arrays.sort(stu, NameComparator);
        bubbleSort(stu);
        System.out.println(Arrays.toString(stu));
    }
}
