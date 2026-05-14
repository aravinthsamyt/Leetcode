int averageValue(int* nums, int numsSize) {
    int sum=0,j=0;
    for(int i=0;i<numsSize;i++){
        if(nums[i]%6==0){
            sum+=nums[i];
            j++;
        }
    }
    return j>0?sum/j:sum;
}