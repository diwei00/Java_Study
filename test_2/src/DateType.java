public class DateType {
    public static void main(String[] args) {
        //变量定义后必须初始化，不然会报错，和c语言不一样
        //int k;
        //System.out.println(k);
        //都是有符号数
        int a = 20;
        System.out.println(a);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        long b = 2000L;
        System.out.println(b);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        float c = 5.5f;
        float c1 = 5.5f;
        System.out.println(c);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

        short b1 = 50;
        System.out.println(b1);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        double d = 6.6;
        System.out.println(d);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        //占用1个字节，运算时会提升为4个字节（cpu架构）
        byte e = 10;
        byte f = 20;
        int g = e + f;
        System.out.println(e);
        System.out.println(g);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        //占用2个字节
        char s = 'w';
        char s2 = 97;
        System.out.println(s);
        System.out.println(s2);
        //参考Unicode字符集，包含ASCLL字符集
        //idea无法解析Unicode最大最小对应的字符
        System.out.println(Character.MIN_VALUE);

        //真假用true和false表示，和c语言不一致
        //大小没有明确规定
        boolean flag1 = true;
        boolean flag2 = false;
        System.out.println(flag2);

        //整形和字符串可以相互转换
        String str1 = "aaaaa";
        String str2 = "bbbbb";
        String str3 = "100000";
        int p = 10;
        int p2 = 20;
        System.out.println(str1);
        System.out.println("a: " + p + p2);
        System.out.println(p + p2 + str1);
        String ret1 = String.valueOf(p);

        System.out.println(ret1);
        int ret2 = Integer.parseInt(str3);
        ret2 += 1;
        System.out.println(ret2);

        int k = 10;
        byte k1 = (byte)k;
        System.out.println(k1);



    }
}
