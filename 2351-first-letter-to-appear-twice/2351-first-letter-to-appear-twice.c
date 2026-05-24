char repeatedCharacter(char* s) {
    char c;
    // int prevMin=10,currMin=0;
    int min=strlen(s);
    for(int i=0;i<strlen(s);i++){
        for(int j=i+1;j<strlen(s);j++){
            if(s[i]==s[j] && min>j){
                min=j;
                c=s[i];
                break;
            }
        }
    }
    return c;
}