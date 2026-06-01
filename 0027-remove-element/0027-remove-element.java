class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int arr[]=new int[5];
        for(int n:nums){
            if(n!=val){
                nums[i]=n;
                i++;
            }
            
        }
        return i;
    }
}