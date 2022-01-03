public class Recursion{
	
	public static int sum(int val){
		if(val > 0){
			return val + sum(val - 1);
		}
		else{
			return 0;
		}
	}

	public static void main(String[] args){
		System.out.println(sum(5));
	}
}

/**
sum(5)

5 + sum(4)
5 + 4 + sum(3)
5 + 4 + 3 + sum(2)
5 + 4 + 3 + 2 + sum(1)
5 + 4 + 3 + 2 + 1 + sum(0)
5 + 4 + 3 + 2 + 1 + 0

print = 15
**/