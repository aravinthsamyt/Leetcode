class Solution {
    public String addBinary(String a, String b) {
        int l1=a.length()-1,l2=b.length()-1;
        String sum="";
        int carry=0;
        int b1,b2,sum1=0;
        while(l1>=0 || l2>=0){
            if(l1>=0  && l2>=0){ 
                b1=a.charAt(l1)-'0';
                b2=b.charAt(l2)-'0';
                sum1=b1^b2^carry;
                carry = (b1&b2)|((b2|b1)*carry);
                l1--;
                l2--;
            }else if(l1>=0){
                b1=a.charAt(l1)-'0';
                sum1=b1^carry;
                carry=b1&carry;
                l1--;
            }else if(l2>=0){
                b2=b.charAt(l2)-'0';
                sum1=b2^carry;
                carry=b2&carry;
                l2--;
            }

            sum=String.valueOf(sum1)+sum;
            
        }
        return carry==1?(String.valueOf(carry)+sum):sum;
    }
}