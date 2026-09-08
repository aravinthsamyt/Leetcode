class Solution {
    public int findFinalValue(int[] nums, int original) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int num:nums){
            set.add(num);
        }
        if(!set.contains(original)){
            return original;
        }
        for(int n:set){
            if(original == n){
                original=n*2;
            }
        }
        return original;
    }
}