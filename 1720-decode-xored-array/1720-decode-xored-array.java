class Solution {
    public int[] decode(int[] encoded, int first) {
        int n=encoded.length;
        int decode[] = new int[n+1];
        decode[0]=first;
        for(int i=1;i<n;i++){
            decode[i]=encoded[i-1]^decode[i-1];
        }
        return decode;
    }
}