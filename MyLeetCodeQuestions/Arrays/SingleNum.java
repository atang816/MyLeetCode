/**
Requirements:
1. There is one number that appears in the nums[] once
2. Find that number


**/
class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num : nums){
            if(set.contains(num))
                set.remove(num);
            else
                set.add(num);
        }
        
        int foundNum = 0;
        for(int num : set)
            foundNum = num;
        return foundNum;
    }
}