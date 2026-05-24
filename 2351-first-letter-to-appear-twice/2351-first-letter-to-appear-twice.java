class Solution {
    public char repeatedCharacter(String s) {
        char c=' ';
        int min=s.length();
        int n=0;
        for(int i=0;i<s.length();i++){
            n=s.indexOf(s.charAt(i),i+1);
            if(min>n && n!=-1){
                min=n;
                c=s.charAt(i);
            }
        }
        return c;
    }
}