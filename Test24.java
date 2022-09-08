import javax.crypto.spec.PSource;

//泛型的上界，检查只能传成Comparable子类，会对传入的参数进行限制，最终会擦除为限制的最高父类
//如果不指定上界，则会默认为T extends Object 擦除为Object
class TestDemo2<T extends Comparable<T>> {
    public T findMax(T[] arr) {
        T max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }
}
//编译时全部将T擦除为Object，运行时没有泛型的概念
class TestDemo<T> {
    //不能直接new泛型数组，防止直接返回Object[]数组，被子类接收而报错
    private T[] arr = (T[])new Object[10];
    public T getPos(int pos) {
        return this.arr[pos];
    }
    public void setPos(T date, int pos) {
        this.arr[pos] = date;
    }


}

class Person implements Comparable<Person>{
    public int age;

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }
    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
class TestDemo3 {
    //泛型静态方法，直接通过类名调用，不new对象无法传递类型实参，通过方法来传递
    public static <T extends Comparable<T>>T findMax(T[] arr) {
        T max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }
    //非静态方法，只能通过对象调用
    public <T extends Comparable<T>>T findMax2(T[] arr) {
        T max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }
}
class TestDemo4<T> {
    private T date;
    public T getDate() {
        return this.date;
    }
    public void setDate(T date) {
        this.date = date;
    }

}
public class Test24 {
    //<?>通配符  可以传递任何类型的对象
    //<?>只是用来编译检查的，最终会擦除掉
    private static void fun(TestDemo4<?> tmp) {
        System.out.println(tmp.getDate());
        //error 不确定传递过来会是什么类型，无法设置
        //tmp.setDate(10);
    }
    public static void main(String[] args) {
        //<String>只是用来编译检查，运行时会被擦除掉
        TestDemo4<String> testDemo4 = new TestDemo4<>();
        testDemo4.setDate("wwwww");
        TestDemo4<Integer> testDemo41 = new TestDemo4<>();
        testDemo41.setDate(10);
        fun(testDemo41);
        fun(testDemo4);
        System.out.println(testDemo4);
    }
    public static void main4(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8};
        //Integer可以省略，方法会根据参数类型自动传
        Integer ret = TestDemo3.<Integer>findMax(arr);
        System.out.println(ret);

        TestDemo3 testDemo3 = new TestDemo3();
        Integer ret2 = testDemo3.findMax2(arr);
        System.out.println(ret2);
    }
    public static void main3(String[] args) {
        Person[] people = {new Person(20), new Person(30)};
        TestDemo2<Person> testDemo2 = new TestDemo2<>();
        Person ret = testDemo2.findMax(people);
        System.out.println(ret);


    }
    public static void main2(String[] args) {
        TestDemo2<Integer> testDemo2 = new TestDemo2<>();
        Integer[] arr = {1,2,3,4};
        Integer ret2 = testDemo2.findMax(arr);
        System.out.println(ret2);
    }
    public static void main1(String[] args) {
        int a = 10;
        //进行类型传参，后面Integer可以省略，会进行类型检查
        TestDemo<Integer> testDemo = new TestDemo<Integer>();
        testDemo.setPos(a, 0);
        //不用进行类型转换（编译器自己转换）
        int ret = testDemo.getPos(0);
        System.out.println(ret);
        //编译器会进行类型检查，只能是Integer被包装类型
        //testDemo.setPos("wu",1);


    }
}
