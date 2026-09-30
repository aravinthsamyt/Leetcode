char* replaceDigits(char* s) {
    for(int i=1;i<strlen(s);i=i+2){
        char ch = s[i-1]+(s[i]-'0');
        s[i] = ch;
    }
    return s;
}