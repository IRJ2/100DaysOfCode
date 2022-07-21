class Solution {
    public int search(int[] nums, int target) {
        
        int[] arr = nums.clone();
        Arrays.sort(arr);
        int result = -1;
        int high = nums.length - 1, low = 0, mid;
        int i = 0;
        
        
        while(high >= low){
            mid = (high + low) / 2;
            
            if(target == arr[mid]){
                result = 1;
                break;
            }
            else if(target > arr[mid])
                low = mid + 1;
            else 
                high = mid - 1;
        }
        if(result == 1){
            while(true){
                if(target == nums[i]){
                    result = i;
                    break;
                }
                i++;
            }
        }
        return result;
    }
}