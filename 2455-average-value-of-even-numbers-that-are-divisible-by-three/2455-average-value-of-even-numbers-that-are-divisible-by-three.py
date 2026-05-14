class Solution(object):
    def averageValue(self, nums):
        sum=0
        j=0
        for i in nums:
            if i%6==0:
                sum=sum+i
                j=j+1
        avg=sum
        if j>0:
            avg=sum/j
        
        return avg

        