
public class Example1 {
	
	public static int staticVar = 0;
	public int instanceVar = 0;
	
	public Example1() {
		this.instanceVar++;
		staticVar++;
	}
	

	public static void main(String[] args) {
		Example1.wakeUp();
		
		Example1 thingA = new Example1();
		Example1 thingB = new Example1();
		
		System.out.println(thingA.instanceVar);
		System.out.println(thingB.instanceVar);
		System.out.println(Example1.staticVar);
		
	}
	
	public static void wakeUp() {
		System.out.println("Wake Up");
	}
}
