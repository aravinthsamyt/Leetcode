class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String sum1="";
        String sum2="";
        for(String s:word1){
            sum1+=s;
        }
        for(String s:word2){
            sum2+=s;
        }
        if(sum1.equals(sum2)){
            return true;
        }
        return false;
    }
}