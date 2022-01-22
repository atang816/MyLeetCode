/*
Requirements:
1. Find two ints that add up to target
2. There is only one solution

Pseudo-Code:
1. Subtract one number from the nums list and see if the difference is in the nums list

// append all nums values into hashmap
for(int i = 0; i < nums.length; i++){
    if(hashmap.containsValue(target - nums[i]))
        return {nums[i], key}
        
return 0;
}
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length < 1)
            return null;
        
        ArrayList<Integer> map = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            map.add(nums[i]);
        }
                
        for(int i = 0; i < nums.length; i++){
            
            if(map.contains(target - nums[i])){
                if(i == map.indexOf(target - nums[i])){
                    continue;
                }
                return new int [] {i, map.indexOf(target - nums[i])};
            }
                
        }
        
        return new int [] {};
    }
}
