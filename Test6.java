



class Person3 {
    //成员属性权限体现出了封装的特性
    //设置一些隐私，然后对外再提供一些接口来操作
    //private设置成员属性为私有，只有本类内可以访问
    //public所有包中都可以访问
    //default同一包中同一类和不同类都可以访问
    private int age;
    private String name;
    //不写权限默认为default;
    int age2;

    //静态成员变量，是和对象没有关系的，和类有关系，存储在方法区
    //在类加载的时候就会为它开辟空间
    //可以直接通过类名访问，也可以通过对象访问，只不过这个静态成员变量，是这个类创建所有对象共享的
    public static int p = 20;

    //静态成员方法
    //只能访问静态成员属性
    //不属于某个对象，是类的方法
    //可以用对象调用，也可以用类名调用，一般为后者
    public static int getP(){
        return p;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

public class Test6 {
    public static void main1(String[] args) {
        Person3 stu = new Person3();

        System.out.println(Person3.p);
        System.out.println(stu.p);
        System.out.println(Person3.getP());
        System.out.println(stu.getP());



    }
    public static void main(String[] args) {

        Test s = new Test();
        System.out.println(s.p);


        w.Test p = new w.Test();
        System.out.println(p.a2);

        //System.out.println(s.p);
        //System.out.println(a.p);

        //System.out.println(a.a2);


        //System.out.println(s.a2);

    }
}
//public class Test6 {
//    public static void main(String[] args) {
//        Person3 stu1 = new Person3();
//        stu1.setAge(21);
//        stu1.setName("吴浩");
//        int age = stu1.getAge();
//        String name = stu1.getName();
//        System.out.println(name + age);
//    }
//
//}
