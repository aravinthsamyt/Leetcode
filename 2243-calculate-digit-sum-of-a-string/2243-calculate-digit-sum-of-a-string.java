class Solution {
    public String digitSum(String s, int k) {
        String S="";
        String S1="";
        while(s.length()>k){
            S1="";
            for(int i=0;i<s.length();i=i+k){ 
                if(s.length() < i+k){ 
                    int n =(s.length()%k);
                       S=s.substring(i,i+n);
                }else{                
                       S=s.substring(i,i+k);
                }
                int sum=0;
                for(char ch:S.toCharArray()){
                    sum=sum+(ch-'0');
                }
                S1=S1+sum;
            }
            s=S1;
        }
        return s;
    }
}