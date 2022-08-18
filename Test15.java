//抽象类用abstract修饰，最大用处就是被继承，不能实例化对象
//内部可以包含普通方法和属性，构造方法也可以 （供子类构造对象时，初始化父类属性）
abstract class A {
    int a;
    public A() {
        System.out.println("kkkkk");
    }
    public void fun2() {
        System.out.println("bbbbb");
    }
    //抽象类中可以有抽象方法，但被继承之后必须重写
    //不能抽象private,final,static方法，由于要被子类重写
    //抽象方法没有加访问限定符时默认public
    //不想重写抽象方法，抽象类只能被抽象类继承，但最终被一般类继承后，还得重写抽象方法
    //抽象类中不一定包含抽象方法，但是有抽象方法的类一定是抽象类
    abstract public void fun();
}
class B extends A {
    public void fun() {
        System.out.println("aaaa");
    }
}
class C extends A {
    @Override
    public void fun() {
        System.out.println("ccccc");
    }
}
class D extends A {
    @Override
    public void fun() {
        System.out.println("ddddd");
    }
}
public class Test15 {
    public static void fun(A p) {
        p.fun();
    }
    public static void main(String[] args) {
        fun(new B());
        fun(new C());
        fun(new D());
    }
}
