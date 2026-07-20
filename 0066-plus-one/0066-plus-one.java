class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int arr[] = new int[length+1];
        for(int i=length-1;i>=0;i--){
            if(digits[i]==9){
                digits[i]=0;
            }else{
                digits[i]+=1;
                return digits;
            }
        }
        arr[0]=1;
        return arr;
        
    }
}