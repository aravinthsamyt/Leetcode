class Solution(object):
    def maximumOddBinaryNumber(self, s):
        count0=s.count('0')
        count1=s.count('1')
        return (count1-1)*'1'+('0'*count0)+'1'
        