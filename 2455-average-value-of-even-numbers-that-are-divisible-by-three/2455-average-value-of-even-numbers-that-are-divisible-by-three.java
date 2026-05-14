class Solution {
    public int averageValue(int[] nums) {
        int sum=0;
        int i=0;
        for(int n:nums){
            if(n%6==0){
                sum+=n;
                i++;
            }
        }
        return i>0?sum/i:sum;
    }
}