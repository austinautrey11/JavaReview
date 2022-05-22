
public class Example1 {
	
	public static void main(String[] args) {
		
		// create some dummy data
		int input = 5;
		
		Example1 eo = new Example1();
		// call your methods here
		System.out.println(eo.factorial(input));
	}

	// create first method here
	// returns a whole number int, is called factorial, and can accept a single int as a parameter
	public int factorial(int num) {
		if (num <= 0) return 0;
		if (num == 1) return 1;
		
		return num * factorial(num - 1);
	}
	
	
}
