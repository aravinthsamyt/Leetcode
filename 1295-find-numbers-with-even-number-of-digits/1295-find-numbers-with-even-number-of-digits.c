int findNumbers(int* nums, int numsSize) {
    //int len = sizeof(nums)/sizeof(*nums);
    int num = 0,count=0;
    for(int i=0;i<numsSize;i++){
        num = log10(abs(nums[i]))+1;
        if(num%2==0){
            count++;
        }
        
    }
    return count;

}