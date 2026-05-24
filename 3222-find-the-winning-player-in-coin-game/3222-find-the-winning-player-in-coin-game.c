char* winningPlayer(int x, int y) {
    char *s = (char*)malloc(10*sizeof(char));
            if(y<4) return "Bob";
            int moves=y/4;
            int min = moves<x?moves:x;
            if(min%2==0){ 
                strcpy(s,"Bob");
            }else{ 
                strcpy(s,"Alice");
            }
            return s;
       
}