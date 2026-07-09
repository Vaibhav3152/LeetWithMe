class Solution {
    public int findLucky(int[] arr) {
        int maxVal = 0;
        for(int num:arr){
            maxVal = Math.max(maxVal,num);
        }
        int [] count = new int[maxVal+1];

        for(int num:arr){
            count[num]++;
        }

        for(int i = maxVal;i>0;i--){
            if(count[i]==i){
                return i;
            }
        }
        return -1;
    }
}