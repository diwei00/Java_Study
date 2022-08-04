public class MaxCommonDivisor {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        int min = a > b ? b : a;
        while(true){
            if(a % min == 0 && b % min == 0)
            {
                System.out.println(min);
                break;
            }
            min--;
        }
    }
}
