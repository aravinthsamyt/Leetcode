class Solution {
    public String longestCommonPrefix(String[] strs) {
        String sum="";
        int n = strs[0].length();
        for(int i=0;i<n;i++){
            for(int j=1;j<strs.length;j++){
                if((i >= strs[j].length()) || (strs[0].charAt(i) != strs[j].charAt(i))){
                    return sum;
                }
            }
            sum += strs[0].charAt(i);
        }
        return sum;
    }
}