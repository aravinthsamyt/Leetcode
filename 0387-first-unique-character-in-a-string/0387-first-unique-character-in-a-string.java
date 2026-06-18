class Solution {
    public int firstUniqChar(String s) {
        boolean tf=false;
        int i,j;
        for(i=0;i<s.length();i++){
            tf=false;
            for(j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j) && j!=i){
                    tf=true;
                    break;
                }
            }
            if(tf==false){
                break;
            }
        }
        if(tf==false){ 
            return i;
        }
        return -1;
    }
}