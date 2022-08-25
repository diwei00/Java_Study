import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Locale;


public class Test20 {
    public static void main(String[] args) {
        //去掉字符串左右两端的空格，保留中间空格
        String str = "  abc   d  f   ";
        System.out.println(str.trim());

        String str2 = "abcdefg";
        System.out.println(str2.contains("abce"));
        System.out.println(str2.startsWith("abc"));
        System.out.println(str2.endsWith("efg"));

    }
    public static void main8(String[] args) {
        String str = "abcdefg";
        //字符串截取，从下标2开始到结束
        System.out.println(str.substring(2));
        //截区间，左闭右开
        System.out.println(str.substring(2,5));
    }
    public static void main7(String[] args) {
        String str = "abc cde f";
        //字符串分割
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        //字符串分割，分为2组
        String[] arr2 = str.split(" ",2);
        System.out.println(Arrays.toString(arr2));

        //记住两个\\代表一个\
        String str2 = "abc\\de\\f";
        String[] arr3 = str2.split("\\\\");
        System.out.println(Arrays.toString(arr3));

        String str3 = "192.168.89";
        String[] arr4 = str3.split("\\.");
        System.out.println(Arrays.toString(arr4));

        String str4 = "abc cde\\k&l";
        //   |连接多个分割符，这些分割符都用来切割字符串
        String[] arr5 = str4.split(" |\\\\|&");
        System.out.println(Arrays.toString(arr5));

    }
    public static void main6(String[] args) {
        String str = "abcdeeeefabc";
        String str2 = str.replace('e','f');
        System.out.println(str2);
        //将第一个abc替换
        String str3 = str.replaceFirst("abc","qqqqq");
        System.out.println(str3);
        String str4 = str.replace("abc","ttt");
        System.out.println(str4);
        //将所有abc替换
        String str5 = str.replaceAll("abc","ggg");
        System.out.println(str5);
    }
    public static void main5(String[] args) {
        //字符串转数组
        String str = "abcdef";
        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //数组转字符串，将数组数据拷贝到str2中value中
        String str2 = new String(arr);
        System.out.println(str2);

        //格式化，类似c语言printf
        String str3 = String.format("%d,%d,%d",2022,8,25);
        System.out.println(str3);

    }
    public static void main4(String[] args) {
        //大小写转换
        String str = "abcdF123";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());


    }
    public static void main3(String[] args) {
        //数字转字符串
        int a = 1234;
        String ret = String.valueOf(a);
        System.out.println(ret);
        double b = 12.3;
        String ret2 = String.valueOf(b);
        System.out.println(ret2);
        //字符串转数字
        String str = "1234";
        int c = Integer.parseInt(str);
        System.out.println(c);
        String str2 = "12.34";
        double d = Double.parseDouble(str2);
        System.out.println(d);
    }
    public static void main2(String[] args) {
        String str1 = "abcdcabc";
        String str2 = "abcd";
        System.out.println(str1.compareTo(str2));
        //查找字符，返回下标，没有则返回-1
        System.out.println(str1.indexOf('c'));
        System.out.println(str1.indexOf('e'));
        System.out.println(str1.indexOf('c',3));
        //查找字符串，返回字字符串起始下标
        System.out.println(str1.indexOf("abc"));
        System.out.println(str1.indexOf("abc",3));
        System.out.println(str1.indexOf("ggg"));
        //从后往前找，返回第一次出现位置
        System.out.println(str1.lastIndexOf('c'));
        //从下标为2位置开始，从后往前找
        System.out.println(str1.lastIndexOf('c',2));
        //从后往前找字符串
        System.out.println(str1.lastIndexOf("abc"));
        //从下标为2开始，从后往前找
        System.out.println(str1.lastIndexOf("abc",2));

    }

    public static void main1(String[] args) {
        //三种方法
       String str = "abcdef";
       //调用构造方法，将数组拷贝当前对象的value中
       String str2 = new String("abcdef");
       char[] str3 = {'a','b','c','d'};
       //将数组拷贝导value数组中
       String str4 = new String(str3);
       System.out.println(str.equals(str2));
       for(int i = 0; i < str4.length(); i++) {
           System.out.println(str4.charAt(i));
       }
    }
}
