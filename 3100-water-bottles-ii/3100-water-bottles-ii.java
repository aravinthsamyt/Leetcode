class Solution{ 
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int emptyBottles=numBottles;
        while(numExchange<=numBottles){
            numBottles-=numExchange;
            numExchange++;
            numBottles++;
            emptyBottles++;
        }
        return emptyBottles;
    }
}