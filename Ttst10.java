class OutClass{
    int a;
    public int b;
    private int c;
    //外部类不能直接访问内部类成员，可已通过对象.的方法
    public void fun2(){

        InterClass s = new InterClass();
        System.out.println(s.a2);
        s.fun1();

    }


    //实例内部类
    class InterClass{
        int a;
        int a2;
        public int b2;
        private int c2;
        //可以在方法中直接访问外部类成员
        public void fun1(){
            a = 10;
            b = 20;
            a2 = 10;
            //当外部类和内部类有完全相同的成员变量时，内部类优先访问，就近原则
            System.out.println(a);

            //想要访问外部类成员变量时，需声明外部类对象
            OutClass.this.a = 80;
            System.out.println(OutClass.this.a);
        }


    }
}
public class Ttst10 {
    public static void main(String[] args) {
        //示例内部类创建对象需先有外部类对象
        OutClass s = new OutClass();
        s.fun2();
        OutClass.InterClass p = s.new InterClass();
        p.fun1();

        System.out.println(p.a2);
    }
}
