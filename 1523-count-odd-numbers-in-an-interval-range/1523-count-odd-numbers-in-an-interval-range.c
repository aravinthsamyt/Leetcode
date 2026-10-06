int countOdds(int low, int high){
    int num = (high-low)+1;
    if(num%2==0){
        return num/2;
    }
    return low%2!=0?(num/2)+1:(num/2);
}