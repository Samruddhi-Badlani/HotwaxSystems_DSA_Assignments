
public class Array3 {
	 public static int findDuplicate(int[] A)
	    {
	        int duplicate = -1;
	 
	       
	        for (int i: A)
	        {
	           
	            int val = (i < 0) ? -i : i;
	 
	         
	            if (A[val-1] >= 0) {
	                A[val-1] = -A[val-1];
	            }
	            else {
	             
	                duplicate = val;
	                break;
	            }
	        }
	 
	       
	        for (int i = 0; i < A.length; i++)
	        {
	          
	            if (A[i] < 0) {
	                A[i] = -A[i];
	            }
	        }
	 
	       
	        return duplicate;
	    }
	 
	    public static void main (String[] args)
	    {
	     
	        int[] A = { 1, 2, 3, 4, 2 };
	 
	        System.out.println("The duplicate element is " + findDuplicate(A));
	    }
}
