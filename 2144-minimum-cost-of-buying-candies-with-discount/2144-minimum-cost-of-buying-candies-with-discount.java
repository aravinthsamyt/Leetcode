class Solution {
    public int minimumCost(int[] cost) {
        if(cost.length<3) return Arrays.stream(cost).sum();
        for(int i=1;i<cost.length;i++){
            int key=cost[i];
            int j=i-1;
            while(j>=0 && cost[j]<key){
                cost[j+1]=cost[j];
                j--;
            }
            cost[j+1]=key;
        }
        int sum=0;
        int i;
        for(i=0;i<cost.length;i+=3){
            if((i+1)==cost.length) break;
            sum+=cost[i]+cost[i+1];
        }
        if(cost.length%3==1) return sum+cost[i];
        return sum;

    }
}