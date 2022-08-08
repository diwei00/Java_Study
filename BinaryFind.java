public class BinaryFind {
    private static int BubbleSort1(int[] arr, int key){
        if(arr == null){
            return -1;
        }
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = (left + right) >>> 1;
            if(key > arr[mid]){
                left = mid + 1;
            }else if(key == arr[mid]){
                return mid;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = BubbleSort1(arr, 6);
        System.out.println(arr[index]);
    }


}
