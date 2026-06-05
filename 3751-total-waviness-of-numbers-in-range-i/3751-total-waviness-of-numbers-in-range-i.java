class Solution {
    public int totalWaviness(int num1, int num2) {
             String s1 = String.valueOf(num1);
             int n1=0,j=1,i=num1,k=0;
        while(i <= num2){
               s1 = String.valueOf(i);
              if(s1.length()<3){
                i++;
                continue;
              }
              n1=s1.charAt(j)-'0';
              if((n1 < s1.charAt(j-1)-'0' && n1 < s1.charAt(j+1)-'0') || (n1 > s1.charAt(j-1)-'0' && n1 > s1.charAt(j+1)-'0')){
                k++;
              }
              j++;
              if(j>s1.length()-2){
                i++;
                j=1;
              }
              
        }
        return k;
    }
}