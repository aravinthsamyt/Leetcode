class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        int lrSum=0;
        if(n==1) return new int[]{0};
        for(int i=0;i<n-1;i++){
            lrSum+=nums[i];
            arr1[i+1]=lrSum;
        }
        lrSum=0;
        for(int i=n-1;i>0;i--){
            lrSum+=nums[i];
            arr2[i-1]=lrSum;
        }
        for(int k=0;k<nums.length;k++){
            arr1[k]=Math.abs(arr1[k]-arr2[k]);
        }
        return arr1;
    }
}