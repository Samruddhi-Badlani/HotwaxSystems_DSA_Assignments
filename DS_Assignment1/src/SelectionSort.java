
public class SelectionSort {
	
	
	public static  void sort(int arr[]) {
		
		int i=0;
		int n = arr.length;
		
		for(i = 0; i < n - 1 ; i++ ) {
			
			int min_idx = i;
			for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
		}
		
	}
	
	public static void main(String[] args) {
		
		int array[] = {10,21,13,4,5};
		
		sort(array);
		
		for(int i=0;i<array.length ; i++) {
			System.out.println(array[i]);
		}
	}
}
