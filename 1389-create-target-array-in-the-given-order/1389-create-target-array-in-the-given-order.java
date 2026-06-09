class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            if(i > index[i]){
                int j=i;
                int temp=nums[i];
                while(j>index[i]){
                    arr[j]=arr[j-1];
                    j--;
                }
                arr[index[i]]=temp;
            }else{
                arr[index[i]]=nums[i];
            }
        }
        return arr;
    }
}