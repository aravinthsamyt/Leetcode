class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<=numRows-1;i++){
            List<Integer> list1 = new ArrayList<>();
            int k=0;
            for(int j=0;j<=i;j++){
                
                if(j==0 || j==i){
                    list1.add(1);
                }else{
                    List<Integer> l = list.get(i-1);
                    list1.add(l.get(k)+l.get(k+1));
                    k++;
                }
            }
            list.add(list1);
        }
        return list;
    }
}