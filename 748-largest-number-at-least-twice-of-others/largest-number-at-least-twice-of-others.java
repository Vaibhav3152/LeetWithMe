class Solution {
    public int dominantIndex(int[] nums) {
        int max1 = 0;
        int max2 = 0;
        int maxId=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max1){
                max2=max1;
                max1=nums[i];
                maxId=i;
            }
            else if(nums[i]>max2){
                max2=nums[i];
            }

            }
            if(max2*2<=max1){
                return maxId;
            }
            else{
                return -1;
            }
        }
    }