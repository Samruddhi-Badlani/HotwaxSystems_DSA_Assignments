import java.util.Arrays;
public class Array2 {
	 public static void sort(int[] A)
	    {
	     
	        int zeros = 0;
	        for (int value: A)
	        {
	            if (value == 0) {
	                zeros++;
	            }
	        }
	 
	       
	        int k = 0;
	        while (zeros != 0) {
	            A[k] = 0;
	            k++;
	            zeros -- ;
	        }
	 
	       
	        while (k < A.length) {
	            A[k] = 1;
	            k++;
	        }
	    }
	 
	    public static void main (String[] args)
	    {
	        int[] array = { 0, 1, 1, 0, 0, 1, 0, 1, 0, 1 };
	 
	        sort(array);
	 
	        // print the rearranged array
	        System.out.println(Arrays.toString(array));
	    }
}
