class Solution(object):
    def arraySign(self, nums):
        sign=0
        for i in nums:
            if i==0: return 0
            if i<0: sign=sign+1
        if sign%2==0: return 1
        return -1 
        