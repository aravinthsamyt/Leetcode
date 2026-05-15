int arraySign(int* nums, int numsSize) {
    
    int sign=0;
    for(int i=0;i<numsSize;i++){
        if(nums[i]==0){
            return 0;
        }
        if(nums[i]<0){
            sign++;
        }
        
    }
    if((sign%2) == 0){return 1;}
    return -1;
}