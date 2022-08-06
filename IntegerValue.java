import java.util.Scanner;
public class IntegerValue {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        while(scan.hasNextInt()){
            int n = scan.nextInt();
            while(n != 0){
                System.out.print(n % 10 + " ");
                n /= 10;
            }
        }

    }
}
