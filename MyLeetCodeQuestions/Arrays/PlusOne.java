Plus One

/**
Requirements:
1. Increment the right most integer by one
2. In case of carry, need to add carry to the next digits place

Pseudo-code:
1. digits[digits.length - 1]++;
2. If last digit > 9
    Change digits[digits.length - 1] to only the one's place digit
    int carry = 1
    for(i = digits.length-2; i >= 0; i--){
        digits[i]++;
        if(digits[i] < 10)
            carry = 0;
            break
        
    }
    if(carry == 1)
        int result = new int[digits.length + 1]
        result[0] = carry;
        // copy digits array to result array with carry as the first index
        return result;
    return digits
**/

class Solution {
    public int[] plusOne(int[] digits) {
        digits[digits.length - 1]++;
        
        if(digits[digits.length - 1] > 9){
            digits[digits.length - 1] = digits[digits.length - 1] % 10;
            
            int carry = 1;
            for(int i = digits.length - 2; i >= 0; i--){
                digits[i]++;
                if(digits[i] < 10){
                    carry = 0;
                    break;
                }
                digits[i] = digits[i] % 10;
                
            }
            if(carry == 1){
                int[] result = new int[digits.length + 1];
                result[0] = carry;
                for(int i = 0; i < digits.length; i++)
                    result[i+1] = digits[i];
                
                return result;


            }
        }
        
        return digits;
    }
}
