class Solution {
    public int missingNumber(int[] nums) {
        int len=nums.length;
        int Sum = (len*(len+1))/2;
        int Sum1 = Arrays.stream(nums).sum();
        return Sum-Sum1;
    }
}