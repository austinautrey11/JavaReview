import java.util.Arrays;
public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {6,2,3,1,7,1,4,5,8};
		int[ sorted = sortArray(arr);
		
		for (int i = 0; i < sorted.length; i++) {
			System.out.println(sorted[i] + " "); // 1 1 2 3 4 5 6 7 8
			
		}
		
	}
	
	public static int sortArray(int[] selectionArr) {
		for (int i = 0; i < selectionArr.length; i++) {
			// reference to lowest index based on current iteration
			int minIndex = i;
			
			//inner loop used to compare elements
			for (int j = i+ 1; j < selectionArr.length; j++) {
				if (selectionArr[j] < selectionArr[minIndex]) {
					minIndex = j;
				}
			}
			int larger = selectionArr[i];
			selectionArr[i] = selectionArr[minIndex];
			selectionArr[minIndex] = larger;
		}
		return selectionArr;
	}

}
