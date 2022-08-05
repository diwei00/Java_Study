import java.util.Scanner;
public class IsPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 0;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                break;
            }
        }
        if (i == n) {
            System.out.println(n + "是素数");
        } else {
            System.out.println(n + "不是素数");
        }
    }
}
