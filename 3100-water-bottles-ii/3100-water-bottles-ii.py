class Solution(object):
    def maxBottlesDrunk(self, numBottles, numExchange):
        emptyBottles=numBottles
        while numBottles >= numExchange:
            numBottles-=numExchange
            numExchange+=1
            numBottles+=1
            emptyBottles+=1
        return emptyBottles
        