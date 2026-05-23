class Solution(object):
    def largestOddNumber(self, num):
        i=len(num)-1
        while i>=0:
            if int(num[i])%2 != 0:
                return num[0:i+1]
            i=i-1
        return ""