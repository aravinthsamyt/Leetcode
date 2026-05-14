class Solution(object):
    def numIdenticalPairs(self, nums):
        n=0
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                if nums[i]==nums[j] and i<j:
                    n=n+1
        return n
        