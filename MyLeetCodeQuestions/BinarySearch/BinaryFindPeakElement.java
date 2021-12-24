/*
Requiremets:
1. Binary serach through array
2. find an index i where the neightbors are less than nums[i]

3. Question of if peek can be at the edge of array -----> NEED TO FIGURE THIS OUT
4. Question of if all elemenets are equal

Pseudo-Code:
1. left = 0, right = nums.length - 1
2. while(left <= right)
    
    if(nums[left] > nums[left + 1] && nums[left] > nums[left - 1])
        return left
    else if(nums[right] > nums[right + 1] && nums[right] > nums[right - 1])
        return right
    else
        left++;
        right++;
3. return -1
*/
class Solution {
    public int findPeakElement(int[] nums) {
        
        if(nums.length == 1)
            return 0;
        
        int left = 1;
        int right = nums.length - 2;
        
        while(left <= right){
            if(nums[left] > nums[left + 1] && nums[left] > nums[left - 1])
                return left;
            else if(nums[right] > nums[right + 1] && nums[right] > nums[right - 1])
                return right;
            else{
                left++;
                right--;
            }
        
        }
        if(nums[0] > nums[1])
            return 0;
        if(nums[nums.length - 1] > nums[nums.length - 2])
            return nums.length - 1;
        
        return -1;
    }
}