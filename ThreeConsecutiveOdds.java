public class ThreeConsecutiveOdds {
    public static boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                count++;
                if(count == 3){
                    return true;
                }
            }else{
                count = 0;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 6, 7, 9, 3, 6};
        boolean ret = threeConsecutiveOdds(arr);
        System.out.println(ret);
    }
}
