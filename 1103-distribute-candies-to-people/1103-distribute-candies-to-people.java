class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int arr[] = new int[num_people];
        int i=0,p=1;
        while(candies>0){
            arr[i++] += candies > p?p:candies;
            candies-=p;
            p++;
            if(i==num_people){ 
                 i=0;
            }
        }
    return arr;
    }
}