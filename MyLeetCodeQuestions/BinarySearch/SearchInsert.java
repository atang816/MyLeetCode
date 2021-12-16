/**
Requirements:
1. Find target in array and return its index
2. If elment not in array -> return index where target would be

Pseudo-Code:
1. left = 0; right = nums.length; indexShouldBe = 0;
2. while(left <= right)
    mid = (left + right)/2
    // Do binary search

3. indexShouldBe = mid
4. return indexShouldBe

**/
class Solution {
    public int searchInsert(int[] nums, int target) {
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
        
        return left;
        
        
    }
}