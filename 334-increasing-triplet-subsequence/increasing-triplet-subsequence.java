class Solution {
    public boolean increasingTriplet(int[] nums) {
        int i=Integer.MAX_VALUE;
        int j=Integer.MAX_VALUE;        
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