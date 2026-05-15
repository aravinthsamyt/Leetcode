int missingNumber(int* nums, int numsSize) {
    int length = sizeof(nums)/sizeof(nums[0]);
    int sum=0;
    for(int i=0;i<numsSize;i++){
        sum+=nums[i];
    }
    int sum1=(numsSize*(numsSize+1))/2;
    return sum1-sum;
}