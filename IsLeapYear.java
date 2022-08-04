import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        //从键盘输入
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int year = 1000; year <= num; year++) {
            if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0) {
                System.out.println(year + "是闰年");
            }else{
                System.out.println(year + "不是闰年");
            }
        }
    }
}
