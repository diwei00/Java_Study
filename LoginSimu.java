import java.util.Scanner;
public class LoginSimu {
    //模拟登录
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int passWord = 123456;
        int count = 3;
        while ((count--) != 0){
            int tmp = 0;
            System.out.println("请输入你的密码");
            tmp = scan.nextInt();
            if(tmp == passWord){
                System.out.println("输入正确");
                break;
            }else if(count != 0){
                System.out.println("输入错误请重新输入");
            }
        }
        if(count == -1){
            System.out.println("三次机会已用完");
        }
    }
}
