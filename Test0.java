class W2 {
    int a;
    public void fun() {
        a = 10;
        System.out.println(a);
    }
}
class W3 extends W2 {
    int b;
    public void fun() {
        System.out.println("aaaaa");
    }
    public void fun2() {
        super.fun();
    }
}
public class Test12 {
    public static void main(String[] args) {
        //向上转型
        W2 stu = new W3();
        //向下转型
        //确保stu引用了W3这个对象
        if(stu instanceof W3) {
            W3 stu2 = (W3) stu;
            //访问子类中特有成员
            System.out.println(stu2.b);
        }
    }
}
