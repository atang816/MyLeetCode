/*
0. Convert the integer to string
1. Count the length of the number digits
2. Iterate through to get each integer from number
3. sum += pow(digit, num_length)
4. if sum == input_num --> return true
*/

public boolean isArmstrong(int num){
	if(num < 0)
		return false;

	String num_as_string = Integer.toString(num);
	int string_len = num_as_string.length();
	int sum = 0;

	for(int i = 0; i < string_len; i++){
		int digit = Integer.parseInt(num_as_string.substring(i, i+1));
		sum += Math.pow(digit, string_len);
		
	}

	return sum == num;
	
}
