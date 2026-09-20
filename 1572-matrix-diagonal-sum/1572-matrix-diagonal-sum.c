int diagonalSum(int** mat, int matSize, int* matColSize) {
    if(matSize<2) return mat[0][0];
    int result=0,n=matSize;
    for(int i=0;i<matSize;i++){
            if(i == (n-i-1)){
                result = result+mat[i][n-i-1];
            }else{
                result = result+ mat[i][i]+ mat[i][n-i-1];
            }
    }
    return result;
}