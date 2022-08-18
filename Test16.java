//有了接口之后, 类的使用者就不必关注具体类型,而只关注某个类是否具备某种能力.

interface IA {
    //不能实例化对象
    //接口中只能存在public abstract公共抽象类方法
    //不写，则默认是它，
    //不能实现抽象类方法，只能在类实现接口时，重写抽象类方法
    //接口中不能有静态代码块，和构造方法，因为接口是用来被实现的
    void fun();

    //默认是public static final变量，常量就得初始化
    int a = 0;

}
interface IB {
    void fun2();
}
class B2 implements IA {
    @Override
    public void fun() {
        System.out.println("aaaa");
    }
}
//接口之间可以相互联合，接口之间可以多继承
interface IC extends IA, IB {
    void fun3();
}
//一个类可以同时实现多个接口，弥补了多继承
class C2 implements IA, IB {
    @Override
    public void fun() {
        System.out.println("ccccc");
    }

    @Override
    public void fun2() {
        System.out.println("aaaaa");
    }
}
class D2 implements IC {
    //实现接口时必须对所有接口中抽象方法重写，不然就得用抽象类来实现
    @Override
    public void fun() {
        System.out.println("a");
    }

    @Override
    public void fun2() {
        System.out.println("b");
    }

    @Override
    public void fun3() {
        System.out.println("c");
    }
}
public class Test16 {
    public static void main(String[] args) {
        D2 s = new D2();
        s.fun();
        s.fun2();
        s.fun3();
        C2 s2 = new C2();
        s2.fun();
        s2.fun2();
    }
}
