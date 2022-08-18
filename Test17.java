import java.util.Objects;

abstract class A0 {
    //抽象类
    public abstract void fun2();
}
class A3 {
    private int a;
    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return this.a;
    }
    public void fun() {
        System.out.println("aaa");
    }
    public void fun2() {
        System.out.println("bbbbbb");
    }

    //重写Object中equals
    //Object为所有没有继承类的父类
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
                         //缺省this，实际是this.getClass , 返回值时对象的类型
        if (o == null || getClass() != o.getClass()) return false;
        A3 a3 = (A3) o;
        return a == a3.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}
class C3 extends A3 {
    @Override
    public void fun() {
        System.out.println("a");
    }
}
public class Test17 {
    //可以用Object接收
    private static void fun(Object s) {
        A3 p2 = new A3();
        A3 p3 = new A3();

        boolean a = s.equals(p2);
        System.out.println(a);
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());

    }
    public static void main(String[] args) {
        A3 p = new A3();
        fun(p);
    }
}
