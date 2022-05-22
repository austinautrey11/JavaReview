
public class ReturnTypes {
	
	public static void main(String[] args) {
		
		//create a class instance
		ReturnTypes rt = new ReturnTypes();
		
		// call your method here
		rt.returnNothing();
		
		// call second method here
		boolean b = rt.returnBoolean();
		
		// print your boolean
		System.out.println("The value of b is: " + b);
	}

	// create method here that does not return anything
	public void returnNothing() {
		System.out.println("Inside of a void method");
	}
	
	// method that does return something
	public boolean returnBoolean() {
		return true;
	}
}
