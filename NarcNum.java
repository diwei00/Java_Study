public class NarcNum {
    //水仙花数
    public static void main(String[] args) {
        for (int i = 1; i < 999; i++) {
            int sum = 0;
            int tmp = i;
            while (tmp != 0) {
                sum += ((tmp % 10) * (tmp % 10) * (tmp % 10));
                tmp /= 10;
            }
            if(sum == i){
                System.out.println(i + " ");
            }
        }
    }
}
