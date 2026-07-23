class Solution {
    public int maximumCount(int[] nums) {
        int negCount = findFirstIndex(nums, 0);
        int posCount = nums.length - findFirstIndex(nums, 1);
        
        return Math.max(negCount, posCount);
    }

    private int findFirstIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = nums.length;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= target) {
                result = mid; 
                right = mid - 1;
            } else {
                left = mid + 1; 
            }
        }

        return result;
    }
}