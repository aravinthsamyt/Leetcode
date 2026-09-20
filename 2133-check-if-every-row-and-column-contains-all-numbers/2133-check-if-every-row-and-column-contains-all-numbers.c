bool checkValid(int** matrix, int matrixSize, int* matrixColSize) {
    int firstSum=0;
    for(int i=0;i<matrixSize;i++){
        for(int j=0;j<matrixSize;j++){
            int pos = abs(matrix[i][j])-1;
            if(matrix[i][pos] < 0) return false;
            matrix[i][pos] = -matrix[i][pos];
        }
    }

    for(int i=0;i<matrixSize;i++){
        for(int j=0;j<matrixSize;j++){
            int pos = abs(matrix[j][i])-1;
            if(matrix[pos][i] > 0) return false;
            matrix[pos][i] = -matrix[pos][i];
        }
    }
    return true;
}