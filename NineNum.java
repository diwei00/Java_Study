public class NineNum {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            int tmp = i;
            while (tmp != 0) {
                if (tmp % 10 == 9) {
                    count++;
                }
                tmp /= 10;
            }
        }
        System.out.println(count);
    }
}
