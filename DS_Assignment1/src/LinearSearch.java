
public class LinearSearch {
	
	public static int search(int arr[],int value) {
		
		
		for(int i = 0 ;i < arr.length ; i++) {
			if(arr[i] == value) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int array [] = {1,4,65,23,78,20} ;
		int value = 3 ;
		if(search(array, value) != -1) {
			System.out.println(value+ " is present in the array ");
		}
		else {
			System.out.println(value+ " is not present in the array ");
		}
		
		
	}
}
