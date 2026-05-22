class Solution {
    public boolean squareIsWhite(String coordinates) {
        char s[] = {'a','b','c','d','e','f','g','h'};
        int i;
        for(i=0;i<8;i++){
            if(coordinates.charAt(0)==s[i]){
                i++;
                break;
            }
        }
        if( (coordinates.charAt(1)%2!=0 && i%2 != 0)  || (coordinates.charAt(1)%2 == 0 && i%2 == 0) ){
            return false;
        }else{
            return true;
        }
    }
}