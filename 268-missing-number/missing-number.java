class Solution {
    public int missingNumber(int[] nums) {
        int range = nums.length;
        int curSum = 0;
        int actualSum = (range*(range+1))/2;

        for(int i=0;i<nums.length;i++){
            curSum += nums[i];
        }
        int ans = actualSum - curSum;
        return ans;
    }
}