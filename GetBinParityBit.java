public class GetBinParityBit {
    public static void main(String[] args) {
        int n = 16;
        int i = 0;
        int ret = 0;
        System.out.println("奇数位");
        while (ret < 32) {
            int tmp = (n >> ret) & 1;
            System.out.print(tmp + " ");
            ret += 2;
        }
        ret = 1;
        System.out.println();
        System.out.println("偶数位");
        while (ret < 32) {
            int tmp = (n >> ret) & 1;
            System.out.print(tmp + " ");
            ret += 2;
        }
    }
}
