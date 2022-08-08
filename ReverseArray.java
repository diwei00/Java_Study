import java.util.Arrays;

public class ReverseArray {
    private static void reverseArray(int[] arr){
        if(arr == null){
            return;
        }
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
