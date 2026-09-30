bool isPalindrome(char* word,int len){
    int i=0,j=len-1;
    while(i<j){
        if(word[i]!=word[j]){
            return false;
        }
        i++;
        j--;
        
    }
    return true;
}

char* firstPalindrome(char** words, int wordsSize) {
    for(int i=0;i<wordsSize;i++){
        if(isPalindrome(*(words+i),strlen(words[i]))){
            return words[i];
        }
    }
    return "";
}