import java.util.Arrays;
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int tmp = nums.length / 2;
        Arrays.sort(nums);
        int count = 1;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                count++;
            }else{
                if(count > tmp){
                    return nums[i];
                }else{
                    count = 1;
                }
            }
        }
        if(nums[nums.length - 1] == nums[nums.length - 2]){
            count++;
        }
        if(count > tmp){
            return nums[nums.length - 1];
        }
        return -1;


    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 2, 5, 2};
        int ret = majorityElement(arr);
        System.out.println(ret);
    }
}
