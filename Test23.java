import java.nio.file.ClosedFileSystemException;
//自定义异常 一般继承Exception类（默认受查异常  编译） 和 RuntimeException类（运行时异常）
class UserNameExcption extends RuntimeException {
    public UserNameExcption() {
        super();
    }
    public UserNameExcption(String message) {
        super(message);
    }

}
class PasswordExcption extends RuntimeException {
    public PasswordExcption() {
        super();
    }
    public PasswordExcption(String message) {
        super(message);
    }
}
class Lobln {
    private String name = "aaaa";
    private String password = "1234";

    public void Logln(String name, String password) {
        try {
            if (!this.name.equals(name)) {
                throw new UserNameExcption("用户名错误");
           /* System.out.println("用户名错误");
            return;*/
            }
            if (!this.password.equals(password)) {
                throw new PasswordExcption("密码错误");
           /* System.out.println("密码错误");
            return;*/
            }
            System.out.println("登录成功");
        } catch (UserNameExcption e) {
            e.printStackTrace();
        } catch (PasswordExcption e) {
            e.printStackTrace();
        }
        System.out.println("kkkkk");
    }
}

public class Test23 {
    public static void fun(int a) throws ClosedFileSystemException{  // 声明异常 throws
        if(a == 10) {
            //手动抛出受查异常（编译）需声明
            throw new ClosedFileSystemException();
        }
    }
    public static void fun2(int a) {
        if (a == 10) {
            throw new NullPointerException("nnnnn");//运行时异常
        }
    }



    public static void main(String[] args) {


        Lobln lobln = new Lobln();
        lobln.Logln("aaaa","12345");

        System.out.println("aaaammm");


    }
    public static void main2(String[] args) {
        //main方法调用，最后必须捕获异常，否则跑到jvm中，程序异常终止
        //如果不想捕获，则需声明，层层向上传递
        try {
            fun(10);
            fun2(10);
        }catch(ClosedFileSystemException e) {
            e.printStackTrace();
            System.out.println("aaaa");
        }catch(NullPointerException e) {
            e.printStackTrace();

        }


    }
    public static void main1(String[] args) {
        //error
        //异常分为运行时异常（RuntimeException）运行时异常又称非受检异常
        //编译时异常  受检异常
        //编译时异常必须要声明异常，调用者也需声明或者捕获异常（throws）
        //所有异常共同父类都是Exception类，默认是受查异常（编译）
        try {
            //一旦出现异常，代码直接到达捕获异常部分，后续try里代码将不执行
            int[] arr = {1, 2, 3, 4, 5, 6};
            System.out.println(arr[100]);
            arr = null;
            System.out.println(arr[0]);
            System.out.println(10/0);

        }catch(NullPointerException e) {
            e.printStackTrace();
            System.out.println("空指针异常");
        }catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("数组越界异常");
        }catch(AbstractMethodError e) {
            e.printStackTrace();
            System.out.println("算数异常");
        }catch(Exception e) {   //保底，不能放在第一个，后面捕获异常则没有意义
            e.printStackTrace();
        }finally{               //不管怎么样，一定会被执行，就算try里代码return也会执行
            System.out.println("aaaaaaaaa");
        }
        //异常一旦被捕获，代码会继续执行，如果没有捕获，则层层向上传，如果到main都没有捕获，则交给jvm程序会异常中断
        System.out.println("bbbbbbbb");



    }
}
