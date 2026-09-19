char* reverseWords(char* s) {
    int length = strlen(s),n=0;
    for(int i=0;i<length;i++){
        if(s[i]!=' '){ 
            n++;
        }
        if(s[i+1] == ' ' || s[i+1]=='\0'){
           int x = i+1-n,y=i;
           while(x<y){
                int temp = s[x];
                s[x] = s[y];
                s[y] = temp;
                x++;
                y--;
           }
           n=0;
        }
    }
    return s;

}