class Solution {
    public void reverseString(char[] s) {
        int l=s.length-1,f=0;
        while(f<l){
            char temp=s[f];
            s[f]=s[l];
            s[l]=temp;
            f++;
            l--;
        }
    }
}