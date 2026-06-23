class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int t=1;
            for(int j=0;j<n;j++){
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