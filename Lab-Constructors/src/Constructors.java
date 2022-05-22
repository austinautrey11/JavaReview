
public class Constructors {
	
	
	// default constructors
	public Constructors() {
		System.out.println("Default constructor ran.");
	}
	// this is the constructor
	public Constructors(int value) {
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		// create instances here
		Constructors c = new Constructors(5839);
		
		// use the no arg constructor
		Constructors cNoArg = new Constructors();
		
		// notice you can overload constructors just like you can with methods
	}
}
