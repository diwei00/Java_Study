public class Test26 {
    public static void main(String[] args) {

        int i = 10;
        //装箱
        Integer a = 10;
        //拆箱
        int b = a.intValue();

        //装箱
        int c = 100;
        Integer d = Integer.valueOf(i);

        //自动拆箱
        int e1 = a;
        int e3 = (int)a;
        //自动装箱
        Integer e2 = i;
        Integer e4 = (Integer)i;

        System.out.println(e1 + " " + e3 + " " + e2 + " " + e4);


    }
}
