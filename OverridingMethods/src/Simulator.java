
public class Simulator {
	
	public static void main(String[] args) {
		
		A a = new A();
		a.talk();
		
		B b = new B();
		b.talk();
		// significance of this is to support polymorhism
		A ab = new B();
		ab.talk();
	}

}
