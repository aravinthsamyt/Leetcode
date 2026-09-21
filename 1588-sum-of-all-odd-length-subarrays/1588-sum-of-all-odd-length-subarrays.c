int sumOddLengthSubarrays(int* arr, int arrSize) {

    int sum1 = 0;
    
    for(int i = 0; i < arrSize; i++) {
        sum1 += arr[i];
    }
    printf("%d\n", sum1);
    
    if(arrSize < 3) {
        return sum1;
    }
    
    for(int odd = 3; odd <= arrSize; odd += 2) {
        int left = 0;
        
        while(left <= arrSize - odd) {
            int sum = 0; 
            
            for(int right = left; right < left + odd; right++) {
                sum += arr[right];
            }
            
            sum1 = sum1 + sum; 
            left++;            
        }
    }
    return sum1;

}