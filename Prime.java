public class Prime {
    public static void main(String[] args) {
        int num = 100;
        for (int i = 1; i <= num; i += 2) {
            int j = 0;
            //优化，直接对i开根号
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if(i == 1){
                System.out.print(2 + " ");
            }
            if (j == i) {
                System.out.print(i + " ");
            }
        }
    }
}
