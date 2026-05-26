class Solution(object):
    def triangleType(self, nums):
        if nums[0]+nums[1]<=nums[2] or nums[2]+nums[1]<=nums[0] or nums[0]+nums[2]<=nums[1]: return "none"
        if nums.count(nums[0])==3: return "equilateral"
        if nums[0]==nums[1] or nums[1]==nums[2] or nums[2]==nums[0]: return "isosceles"
        return "scalene"
        