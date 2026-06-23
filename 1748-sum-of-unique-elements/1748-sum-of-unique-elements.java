class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int t=1;
            for(int j=0;j<nums.length;j++){
                if((nums[i]==nums[j]) && i!=j){
                    t=0;
                    break;
                }
            }
            if(t==1){ 
            sum=sum+nums[i];
            }
        }
        return sum;
    }
}