int minimumDifference(int* nums, int numsSize, int k) {
    if(k==1) return 0;
    int key=0,j=0;
    for(int i=1;i<numsSize;i++){
        key=nums[i];
        j=i-1;
        while(j>=0 && nums[j]>key){
            nums[j+1]=nums[j];
            j--;
        }
        nums[j+1]=key;
    }
    int min = INT_MAX;
    for(int i=0;i<=numsSize-k;i++){
        int result = nums[i+k-1]-nums[i];
        if(result < min){
            min = result;
        }
    }
    return min;

}