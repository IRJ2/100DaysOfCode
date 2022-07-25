class Solution {
    static int findPivot(int arr[], int low, int high)
    {
        // base cases
        if (high < low)
            return -1;
        if (high == low)
            return low;
  
        int mid = (low + high) / 2;
        if (mid < high && arr[mid] > arr[mid + 1])
            return mid;
        if (mid > low && arr[mid] < arr[mid - 1])
            return (mid - 1);
        if (arr[low] >= arr[mid])
            return findPivot(arr, low, mid - 1);
        return findPivot(arr, mid + 1, high);
    }
    public int findMin(int[] nums) {
        int pivot = findPivot(nums,0,nums.length-1);
        pivot= pivot==nums.length-1?0:pivot+1;
        int result = nums[0]<nums[pivot]?nums[0]:nums[pivot];
        return result;
    }
}