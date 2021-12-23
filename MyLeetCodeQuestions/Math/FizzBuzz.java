/**
Requiremets:
1. Return a list of strings
2. Each element will be divided by either 3 or 5
3. if index divisible by 3 and 5 -> "fizzbuzz"
4. if index divisible by 3 -> "fizz"
5. if index divisible by 5 -> "buzz"

Pseudo-Code:
1. if(n < 1)
    return [];

2. List<String> answerSet = new List();

String answer = ""
while(count <= n)
    // keep doing division checks and appending to answerSet
    if(count % 3 == 0)
        answer = "Fizz";
        if(count % 5 == 0)
            answer = answer + "Buzz";
    else if(count % 5 == 0)
        answer = "Buzz";
    else
        answer = Integer.toString(count);
    
    answerSet.add(answer);
    answer = "";
    
return answerSet;
**/

class Solution {
    public List<String> fizzBuzz(int n) {
        if(n < 1)
            return new ArrayList();
        
        List<String> answersSet = new ArrayList();
        String answer = "";
        int count = 1;
        
        while(count <= n){
            if(count % 3 == 0){
                answer = "Fizz";
                if(count % 5 == 0){
                    answer = answer + "Buzz";
                }
            }
            else if(count % 5 == 0){
                answer = "Buzz";
            }
            else{
                answer = Integer.toString(count);
            }
            answersSet.add(answer);
            answer = "";
            count++;
        }
        return answersSet;
    }
}