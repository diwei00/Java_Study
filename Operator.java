public class Operator {
    //操作符
    public static void main(String[] args) {
        int a = 10;
        int b = a << 1;
        System.out.println(b);
        b = a >> 1;
        System.out.println(b);
        b = 20;
        //求平均值
        System.out.println(a + (b - a) >> 1);
        System.out.println(b++);
        System.out.println(b);
        System.out.println(20 > 10);

    }
}
