
public class Example1 {

	public static void main(String[] args) {
		double d = 10.0;
		// autoboxing example
		Double DD = d;
		
		System.out.println(DD);
		
		// un boxing example
		if(DD % 5 == 0.0) { // Double.doubleValue() is called by the compiler
			System.out.println("The number is divisible by 5.");
		}
	}
}
