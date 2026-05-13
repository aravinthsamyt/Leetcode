int* distributeCandies(int candies, int num_people, int* returnSize) {
    int index=1;
    *returnSize = num_people;
    int* arr = (int*)calloc(num_people, sizeof(int));
    while(candies > 0){
        arr[(index-1)%num_people]+=index < candies?index:candies;
        candies-=index;
        index++;
    }
    return arr;

}