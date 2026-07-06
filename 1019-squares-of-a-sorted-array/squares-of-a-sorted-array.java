import java.util.Arrays;
class Solution {
    public int[] sortedSquares(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            nums[k] = nums[i]*nums[i];
            k++;
        }
        for(int i=0;i<nums.length-1;i++){
            for(int j =0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
            return nums;
    }
}