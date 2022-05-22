
public class OverloadedMethods {
	
	public static void main(String[] args) {
		
		// create instance here
		OverloadedMethods om = new OverloadedMethods();
		om.print();
		
		// calling second method
		om.print("second print method");
		
		// calling the third method
		om.print("second", "third");
		
	}
	
	// overload methods here
	public void print() {
		System.out.println("original print method");
	}
	
	// second print method shows example of overloading
	public void print(String str) {
		System.out.println(str);
	}
	
	// third print method
	public void print(String str, String str2) {
		System.out.println(str + " " + str2);
	}
	
	// fourth print method will not work as it specifies the same parameters
	// public void print(String first, String second) {
		// System.out.println(first + " " + second);
	//}

}
