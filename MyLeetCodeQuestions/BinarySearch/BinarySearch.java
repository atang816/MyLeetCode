/**
Psudo-Code:
1. int left = 0;
2. int right = nums.length - 1;
3. 
4. while(left < right)
    int mid = (left + right)/2
    if(numd[mid] == target)
        return mid;
    if(nums[mid] < target)
        left = mid + 1
    if(nums[mid] > target)
        right = mid - 1;
**/
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while(left <= right){
            int mid = (left + right)/2;
            if(nums[mid] == target)
                return mid;
            if(nums[mid] < target)
                left = mid + 1;
            if(nums[mid] > target)
                right = mid - 1;
        }
        return -1;
    }
}