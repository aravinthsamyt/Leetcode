class Solution {
    public String toLowerCase(String s) {
       // return s.toLowerCase();
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            int ch = s.charAt(i);
            if('A' <= ch && 'Z'>=ch){ 
                sb.append((char)(s.charAt(i)+32));
            }else{
                sb.append(s.charAt(i));
            }
        }
        return String.valueOf(sb);
    
    }
}