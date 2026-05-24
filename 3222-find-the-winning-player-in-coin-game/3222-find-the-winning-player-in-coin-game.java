class Solution {
    public String winningPlayer(int x, int y) {
        if(y<4) return "Bob";
        // int moves=x<(y/4)?x:(y/4);
        if((x<(y/4)?x:(y/4))%2 == 0){
            return "Bob";
        }
        return "Alice";

        
    }
}