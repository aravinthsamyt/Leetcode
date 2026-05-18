class Solution(object):
    def maxSubArray(self, nums):
        current = nums[0]
        Max = nums[0]
        for i in range(1,len(nums)):
            if current+nums[i] > nums[i]:
                current=current+nums[i]
            else:
                current=nums[i]
            if current > Max:
                Max = current
        return Max
        