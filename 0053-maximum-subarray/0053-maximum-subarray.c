int max(int a, int b) {
    return (a > b) ? a : b;
}

int crossSum(int* nums, int left, int mid, int right) {

    int sum = 0;
    int leftMax = -100000;

    for(int i = mid; i >= left; i--) {
        sum += nums[i];
        if(sum > leftMax)
            leftMax = sum;
    }

    sum = 0;
    int rightMax = -100000;

    for(int i = mid + 1; i <= right; i++) {
        sum += nums[i];
        if(sum > rightMax)
            rightMax = sum;
    }

    return leftMax + rightMax;
}

int solve(int* nums, int left, int right) {

    if(left == right)
        return nums[left];

    int mid = (left + right) / 2;

    int leftSum = solve(nums, left, mid);
    int rightSum = solve(nums, mid + 1, right);
    int middleSum = crossSum(nums, left, mid, right);

    return max(max(leftSum, rightSum), middleSum);
}

int maxSubArray(int* nums, int numsSize) {
    return solve(nums, 0, numsSize - 1);
}