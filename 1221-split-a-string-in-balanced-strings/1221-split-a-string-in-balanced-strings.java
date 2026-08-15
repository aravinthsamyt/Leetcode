class Solution {
    public int balancedStringSplit(String s) {
        int n = s.length();
        int j=0,count=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i) == 'R'){
                j++;
            }else{
                j--;
            }
            if(j==0){
                count++;
            }
        }
        return count;
    }
}