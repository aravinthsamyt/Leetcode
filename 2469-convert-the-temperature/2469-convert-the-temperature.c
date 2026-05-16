double* convertTemperature(double celsius, int* returnSize) {
    *returnSize = 2;
    double *p = (double*)malloc(2*sizeof(double));
    p[0] = celsius+273.15;
    p[1] = celsius*1.80 + 32.00;
    return p;
}