class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count1=0,count0=0,i=0;
        while(i<s.length()){
            if(s.charAt(i)=='1'){
                count1++;
            }else{
                count0++;
            }
            i++;
        }
        return "1".repeat(count1-1)+"0".repeat(count0)+"1";
    }
}