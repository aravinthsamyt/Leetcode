void binaryConversion(char* s,int i){
    int j=0;
    while(i>0){
        s[j]=i%2 + '0';
        i/=2;
        j++;

    }
    s[j]='\0';
    int temp=0;
    int first=0;
    int last=j-1;
    while(first<last){
        temp=s[first];
        s[first]=s[last];
        s[last]=temp;
        first++;
        last--;
    }
}
char* convertDateToBinary(char* date) {
    char str[5];
    strncpy(str,date,4);
    str[4]='\0';
    int y = atoi(str);
    strncpy(str,date+5,2);
    str[2]='\0';
    int m = atoi(str);
    strncpy(str,date+8,2);
    int d = atoi(str);
    char year[20];
    char month[20];
    char day[20];
    binaryConversion(year,y);
    binaryConversion(month,m);
    binaryConversion(day,d);
    char *result = malloc(50);
    sprintf(result,"%s-%s-%s",year,month,day);
    return result;
}