bool vowel(char ch){
    char vowels[] = "aeiouAEIOU";
    for(int i=0;i<10;i++){
        if(vowels[i]==ch){
            return true;
        }
    }
    return false;
}
char* reverseVowels(char* s) {
    int i=0,j=strlen(s)-1;
    bool x=false,y=false;
    while(i<j){
        x=vowel(s[i]);
        y=vowel(s[j]);
        if(x && y){
            int temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }else if(x){
            j--;
        }else if(y){
            i++;
        }else{
            i++;
            j--;
        }
    }
    return s;
}