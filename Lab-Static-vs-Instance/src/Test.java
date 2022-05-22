
public class Test {
	public static void main(String[] args) {
		A.staticCount = 2494;
		System.out.println("class A staticCount: " + A.staticCount);
		
		A a = new A();
		
		System.out.println(a.instanceCount);
		System.out.println(A.staticCount);
		
		A b = new A();
		
		System.out.println(b.instanceCount);
		System.out.println(A.staticCount);
		
		a.instanceCount = 15;
		 System.out.println("object a instanceCount: " + a.instanceCount);
		 System.out.println("object b instanceCount: " + b.instanceCount);
		 
		 System.out.println("class staticCount: " + A.staticCount);
	}

}
