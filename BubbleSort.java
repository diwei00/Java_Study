import java.util.Arrays;

public class BubbleSort {
    private static void BubbleSort2(int[] arr){
        if(arr == null){
            return;
        }
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {8, 9, 5, 6, 7, 4, 3, 1, 2};
        BubbleSort2(arr);
        System.out.println(Arrays.toString(arr));
    }
}
