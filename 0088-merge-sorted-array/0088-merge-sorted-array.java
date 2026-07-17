import java.util.Arrays;

class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if (m < 2 && n == 0)
            return;

        else if (n < 2 && m == 0) {
            nums1[0] = nums2[0];
            return;
        }

        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        Arrays.sort(nums1);
    }
}