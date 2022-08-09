import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static int fun1(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fun1(n - 1);
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    public static void fun2(int n) {
        if (n <= 9) {
            System.out.println(n);
            return;
        }
        fun2(n / 10);
        System.out.println(n % 10);
    }

    public static int sum2(int n) {
        if (n <= 9) {
            return n;
        }
        return n % 10 + sum2(n / 10);
    }

    public static void printArrar(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void fun3(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] *= 2;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        fun3(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void main5(String[] args) {
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        printArrar(arr);
        //System.out.println(Arrays.toString(arr));
    }

    public static void main4(String[] args) {
        int ret = sum2(12345);
        System.out.println(ret);
    }

    public static void main3(String[] args) {
        fun2(1234);
    }

    public static void main2(String[] args) {
        int ret = 10;
        int tmp = sum(10);
        System.out.println(tmp);
    }

    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ret = fun1(n);
        System.out.println(ret);
    }
}
