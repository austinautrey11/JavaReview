import java.util.Arrays;

public class Stack {
	
	private int lastItem = 0;
	private int [] items = new int[0];
	
	// add items to the stack
	//push is used to add new items to the stack and update the last item
	// to the one we are pushing
	public void push(int newItem) {
		int index = items.length; // get current length to store as index
		System.out.println("The array length is: " + index);
		// increase array length by 1, so that we can add our new item
		items = new int[items.length + 1];
		System.out.println("items after extending the length by 1: " + Arrays.toString(items));
		//stores the value in the index
		items[index] = newItem;
		System.out.println("items after storing the new value: " + Arrays.toString(items));
		// update the last item
		lastItem = newItem;
		System.out.println("The last item: "+ lastItem);
		}
	
	// remove items from the stack
	public int pop() {
		//store the last item into a variable
		int tempItem = lastItem;
		
		//copy a new array but remove the last item
		int[] newArray = new int[items.length - 1];
		
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = items[i];
		}
		items = newArray; // update the items array
		lastItem = items[items.length - 1];
		// return our popped item
		return tempItem;
	}

	// view last item
	public int peek() {
		return 0;
	}
}
