import java.util.Arrays;
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; ){
            if(nums[i] == nums[i + 1]){
                i += 2;
            }else{
                return nums[i];
            }
        }
        if(nums[nums.length - 1] != nums[nums.length - 2]){
            return nums[nums.length - 1];
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,2,1,5};
        int ret = singleNumber(arr);
        System.out.println(ret);
    }
}
