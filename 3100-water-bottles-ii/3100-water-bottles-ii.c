int maxBottlesDrunk(int numBottles, int numExchange) {
    int emptyBottles = numBottles;
    while(numBottles>=numExchange){
        numBottles-=numExchange;
        numExchange++;
        numBottles++;
        emptyBottles++;
    }
    return emptyBottles;
}