
class OutClass1{
    int a;
    public int b;
    private int c;
    static int d;


    public void fun2(){
        class Wu{
            int a;
            public int b;
            private int c;
        }
        //局部内部类，只能在局部使用，定义在方法体内部，不能被public等修饰限定符修饰
        Wu s2 = new Wu();
        s2.a = 800;
        System.out.println(s2.a);


        //外部类访问静态内部类需创建对象
        InterClass1 s = new InterClass1();
        s.a2 = 100;
        System.out.println(s.a2);

    }
    static class InterClass1{
        int a2;
        public int b2;
        private int c2;
        public void fun(){
            //静态内部类是不属于对象的，属于类
            //因此不能直接访问外部类成员变量
            d = 80;
            OutClass1 s = new OutClass1();
            s.a = 10;
            s.b = 20;
            System.out.println(s.a + s.b);
            s.fun2();
        }


    }
}
class Person5{
    private int age;
    private String name;

    public Person5(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //打印对象成员
    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Test11 {

    public static void main(String[] args) {
        Person5 p = new Person5(21, "wu");
        System.out.println(p);

    }
    public static void main1(String[] args) {
        //静态内部类可以直接实例化内部类
        OutClass1.InterClass1 s = new OutClass1.InterClass1();
        s.fun();
        OutClass1 s2 = new OutClass1();
        s2.fun2();


    }
}
