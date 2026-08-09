class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<=n-3;i++){
            int left=i+1,right=n-1;
            
            if(i>0 && (nums[i]==nums[i-1])){
                continue;
            }
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    list.add(List.of(nums[i],nums[left],nums[right]));
                    int leftValue = nums[left];
                    int rightValue = nums[right];
                    //list.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while (left < right && nums[left] == leftValue)
                        left++;

                    while (left < right && nums[right] == rightValue)
                        right--;
                }else if(sum>0){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return list;
    }
}