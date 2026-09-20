int findDuplicate(int* nums, int numsSize) {
    for(int i=0;i<numsSize;i++){
        int pos = abs(nums[i])-1;
        if(nums[pos] < 0) return abs(nums[i]);
        nums[pos] = -nums[pos];
    }
    return 1;
}