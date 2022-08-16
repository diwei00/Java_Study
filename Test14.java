

class Person6 {
    int age;
    String name;
    public void fun() {
        System.out.println("aaa");
    }
}
class Stu {
    //在新类中产生现有类的对象,由于新的类是由现有类的对象所组成,所以这种方法称为组合
    //可以复用Person6中的属性和方法
    private Person6 p = new Person6();
    private Person6[] stu = new Person6[5];
    public void fun() {
        System.out.println(p.age);
        System.out.println(p.name);
    }
}
public class Test14 {
    public static void main(String[] args) {
        Stu s = new Stu();
        s.fun();

    }
}
