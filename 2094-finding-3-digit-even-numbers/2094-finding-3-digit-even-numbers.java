class Solution {
    public int[] findEvenNumbers(int[] digits) {
        List <Integer> list=new ArrayList<>();
        int freq[] = new int[10];
        for(int i:digits){
            freq[i]++;
        }
        for(int number=100;number<999;number++){
            if(number%2!=0) continue;
            int a=number/100;
            int b=(number/10)%10;
            int c=number%10;
            int count[]=new int[10];
            count[a]++;
            count[b]++;
            count[c]++;

            boolean t=true;
            for(int j=0;j<10;j++){
                if(count[j] > freq[j]){
                    t=false;
                    break;
                }
            }
            if(t){
                list.add(number);
            }
        }
        int arr[] = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}