class Solution(object):
    def findDuplicate(self, nums):
        tort=nums[0]
        hare=nums[0]
        while True:
            tort=nums[tort]
            hare=nums[nums[hare]]
            if tort==hare:
                break
        tort=nums[0]
        while tort!=hare:
            tort=nums[tort]
            hare=nums[hare]
        return tort

        