class Solution {
    public int findFinalValue(int[] nums, int original) {
        int n = nums.length;
        boolean[] occs = new boolean[1001];
        for (int i = 0; i < n; i++) {
            occs[nums[i]] = true;
        }
        while (original <= 1000 && occs[original]) {
            original *= 2;
        }
        return original;
    }
}