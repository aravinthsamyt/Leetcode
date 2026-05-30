class Solution(object):
    def maxBottlesDrunk(self, numBottles, numExchange):
        emptyBottle=numBottles
        while numBottles >= numExchange:
            numBottles-=numExchange
            numExchange+=1
            numBottles+=1
            emptyBottle+=1
        return emptyBottle
        