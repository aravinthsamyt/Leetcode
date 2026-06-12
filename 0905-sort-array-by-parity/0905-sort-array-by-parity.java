class Solution {
    public int[] sortArrayByParity(int[] nums) {
        for(int i=1;i<nums.length;i++){
            if((nums[i-1] & 0x1)!=0 && (nums[i] & 0x1)==0){
                int val = nums[i];
                int j=i-1;
                while(j>=0 && (nums[j] & 0x1)!=0){
                    nums[j+1]=nums[j];
                    j--;
                }
                nums[j+1]=val;
            }
        }
        return nums;
    }
}