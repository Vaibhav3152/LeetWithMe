class Solution {
    public boolean increasingTriplet(int[] nums) {
        int i=Integer.MAX_VALUE;
        int j=Integer.MAX_VALUE;        
         System.gc();
        if(nums.length < 3){
            return false;
        }
        else{
        for(int a =0;a<nums.length;a++){
        int ele = nums[a];
        if(i>=ele){
            i = ele;
        }
        else if(j>=ele){
            j = ele;
        }
        else{
            return true;
        }
        }
    return false;
    }
    }
}