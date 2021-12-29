/*
Requirements:
1. Find the max sum you can get from nums array
2. Can't get two adjacent nums

Pseudo-Code:
int timesCanIterate = 0;
if(nums.length % 2 == 0)
    timesCanIterate = nums.length/2;
else
    timesCanIterate = (nums.length/2) + 1;

int sum = 0;
int anotherSum = 0;
for(int i = 0; i < timesCanIterate; i+=2)
    sum += nums[i];
    if(i+1 < nums.length)
        anotherSum =+ nums[i+1];
    
return Math.max(sum, anotherSum);
*/
class Solution {
    public int rob(int[] nums) {
        
        if(nums.length == 1)
            return nums[0];
        
        if(nums.length == 2)
            return Math.max(nums[0], nums[1]);
        
        int[] result = new int[nums.length];
        result[0] = nums[0];
        result[1] = Math.max(nums[0], nums[1]);
        
        for(int i =2; i < nums.length; i++){
            result[i] = Math.max(nums[i] + result[i-2], result[i-1]);
        }
        
        
        return result[nums.length-1];

    }
}