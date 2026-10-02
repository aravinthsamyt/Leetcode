class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            int y = (n)&1;
            System.out.println(y);
            if(y==1){
                count++;
            }
            n>>=1;
        }
        return count;
    }
}