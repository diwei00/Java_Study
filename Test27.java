import java.util.*;

class Person00 implements Comparable<Person00> {
    public String name;
    public int score;
    public int age;
    public Person00(String name, int score, int age) {
        this.age = age;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Person00{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person00 o) {
        return this.age - o.age;
    }
}
public class Test27 {
    public static void main(String[] args) {
        Person00 stu1 = new Person00("w",25,20);
        Person00 stu2 = new Person00("ww",256,19);
        Person00 stu3 = new Person00("www",25,17);
        ArrayList<Person00> stu = new ArrayList<>(5);
        stu.add(stu1);
        stu.add(stu2);
        stu.add(stu3);
        //集合类，用来操作集合类型数据
        Collections.sort(stu);
        for(int i = 0; i < stu.size(); i++) {
            System.out.println(stu.get(i));
        }

        //迭代器遍历集合
        Iterator<Person00> it = stu.iterator();

        while(it.hasNext()) {
            System.out.println(it.next() + " ");

        }
        System.out.println();


    }
    public static void main1(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        //默认是没有空间，只有add之后才会默认分配10个空间
        //扩容默认1.5倍
        ArrayList<Integer> arrayList1 = new ArrayList<>(10);
        //直接开辟10个空间

        ArrayList<Integer> arrayList2 = new ArrayList<>(arrayList);
        //将arrayList底层数组内容拷贝到当下集合
        System.out.println(arrayList2.get(0));
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList3.add(1);
        arrayList3.add(2);
        arrayList3.add(3);
        arrayList3.add(4);
        arrayList3.add(5);
        int ret = arrayList3.indexOf(new Integer(1));
        System.out.println(ret);
        //截取方法，截取结果在原集合当中，并不是新的对象
        List<Integer> ret2 = arrayList3.subList(1,4);
        ret2.set(1,100);
        System.out.println(ret2);
        System.out.println(arrayList3);
        arrayList3.remove(1);
        System.out.println(arrayList3);

        Iterator<Integer> it = arrayList3.iterator();
        //迭代器remove直接抛异常
        it.remove();
        System.out.println(arrayList3);

    }



}
