
public class SomeClass {
	
	long serialNumber;
	
	public SomeClass() {
		this(10l);
		System.out.println("Inside Default no args constructor");
		
	}

	public SomeClass(long serialNumber) {
		this.serialNumber = serialNumber;
		System.out.println("Inside construcor with parameters");
	}
	
	public static void main(String[] args) {
		SomeClass sc = new SomeClass();
	}
}
