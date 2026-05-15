class Solution(object):
    def missingNumber(self, nums):
        Sum=sum(nums)
        Sum1=(len(nums)*(len(nums)+1))/2
        return Sum1-Sum
        