class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }

        for(int i=1;i<nums.length;i++){
            if(nums[i] < nums[i-1]){
                int val=nums[i];
                int j=i-1;
                while(j>=0 && nums[j] > val){
                    nums[j+1]=nums[j];
                    j--;
                }
                nums[j+1]=val;
            }
        }
        return nums;
    }
}