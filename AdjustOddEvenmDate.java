import java.util.Arrays;

public class AdjustOddEvenmDate {
    public static void adjustOddEvenmDate(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (arr[left] % 2 != 0 && left < right) {
                left++;
            }
            while (arr[right] % 2 == 0 && left < right) {
                right--;
            }
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 3};
        adjustOddEvenmDate(arr);
        System.out.println(Arrays.toString(arr));
    }
}
