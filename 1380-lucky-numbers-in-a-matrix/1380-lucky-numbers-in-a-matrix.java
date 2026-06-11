class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for(int arr[]:matrix){
            int min=Integer.MAX_VALUE;
            for(int a:arr){
                if(min > a){
                    min=a;
                }
            }
            row.add(min);
        }
        for(int j=0;j<matrix[0].length;j++){
            int max=0;
             for(int i=0;i<matrix.length;i++){
                if(max < matrix[i][j]){
                    max=matrix[i][j];
                }
            }
            col.add(max);
        }
        for(Integer i:row){
            for(Integer j:col){
                if(i.equals(j)){
                    ans.add(i);
                }
            }
        }
        return ans;

      
    }
}