class Solution(object):
    def minBitFlips(self, start, goal):
        result=start^goal
        i=0
        while result > 0:
            i+=result&1
            result>>=1
        return i
        # return bin(start^goal).count('1') --> one line answer <--
        