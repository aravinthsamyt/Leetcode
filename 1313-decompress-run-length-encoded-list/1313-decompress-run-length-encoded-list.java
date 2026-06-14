class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int freq=0;
        for(int i=0;i<nums.length;i=i+2){
            freq=freq+nums[i];
            for(int j=0;j<nums[i];j++){
                list.add(nums[i+1]);
            }
        }
        int result[] = new int[freq];
        for(int i=0;i<freq;i++){
            result[i] = list.get(i);
        }
        return result;
    }
}