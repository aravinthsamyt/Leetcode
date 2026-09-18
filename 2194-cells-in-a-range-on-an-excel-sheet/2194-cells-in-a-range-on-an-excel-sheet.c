/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
char** cellsInRange(char* s, int* returnSize) {
    *returnSize = ((s[3]-s[0])+1)*((s[4]-s[1])+1);
    // char x = s[0]-'A',y = s[3]-'A';
    // int x1 = s[1]-'0',y1 = s[4]-'0';
    char** result = (char**)calloc(*returnSize,sizeof(char*));
    int index = 0;
    for(int i=s[0];i<=s[3];i++){
        for(int j=s[1];j<=s[4];j++){
            result[index] = (char*)calloc(3, sizeof(char));
            result[index][0]=i;
            result[index][1]=j;
            result[index][2]='\0';
            index++;
        }
    }
    return result;
}