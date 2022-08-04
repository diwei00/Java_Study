public class BinOneNum {
    public static void main(String[] args) {
        int a = 15;
        int count = 0;
        for (int i = 0; i <= 31; i++) {
            if(((a>>i) & 1) == 1){
                count++;
            }
        }
        System.out.println(count);

    }
}
