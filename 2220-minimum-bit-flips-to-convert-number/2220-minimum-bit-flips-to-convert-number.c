int minBitFlips(int start, int goal) {
    int result = start^goal;
    int i=0;
    while(result!=0){
        i+=(result)&1;
        result>>=1; 
    }
    return i;
}