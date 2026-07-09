class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int ele = arr[i];
            if(h.containsKey(ele)==true){
                h.put(ele,h.get(ele)+1);
            }
            else{
                h.put(ele,1);
            }
        }

        int ans = -1;

        for(int key: h.keySet()){
            if(h.get(key)==key){
                ans = Math.max(ans,key);
            }
        }
        return ans;
    }
}