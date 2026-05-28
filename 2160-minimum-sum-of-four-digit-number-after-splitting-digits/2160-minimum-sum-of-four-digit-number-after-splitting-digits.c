int minimumSum(int num) {
    int arr[4];
    for(int i=0;i<4;i++){
        arr[i]=num%10;
        num/=10;
    }
    for(int i=1;i<4;i++){
        int key=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
    }
    return ((arr[0]*10)+arr[2])+((arr[1]*10)+arr[3]);
}