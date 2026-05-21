char* maximumOddBinaryNumber(char* s) {
    char arr[10],arr1[10];
    int i=0,count1=0,count0=0;
    int l=strlen(s);
    while(s[i] != '\0'){
        if(s[i]=='0'){
           count0++;
        }else{
           count1++;
        }
        i++;
    }
    i=0;
   /* char *result = (char*)malloc((l+1)*sizeof(char));
    memset(result,'0',l);
    result[l]='\0';*/
    while(i<count1-1){
        s[i++]='1';
    }
    while(i<(l-1)){
        s[i++]='0';
    }
    s[i]='1';
    return s; 
}