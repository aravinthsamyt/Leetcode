class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for(String s:emails){
            String s1 = s.substring(0,s.indexOf("@"));
            if(s1.indexOf("+") != -1){ 
            s1 =  s1.substring(0,s1.indexOf("+"));
            }
            s1 = s1.replace(".","");
            set.add(s1+( s.substring(s.indexOf("@"))));
        }
        return set.size();
    }
}