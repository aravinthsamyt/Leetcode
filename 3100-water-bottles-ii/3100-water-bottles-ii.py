class Solution(object):
    def maxBottlesDrunk(self, numBottles, numExchange):
        """
        :type numBottles: int
        :type numExchange: int
        :rtype: int
        """
        res = numBottles
        while numBottles >= numExchange:
            numBottles -= numExchange - 1
            numExchange += 1
            res += 1
        return res