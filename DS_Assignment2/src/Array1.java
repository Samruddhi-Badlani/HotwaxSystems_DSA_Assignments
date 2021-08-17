import java.util.HashMap;
import java.util.Map;
public class Array1 {
	
	
	  public static void findPair(int[] array, int target)
	    {
		  
	        
	        Map<Integer, Integer> map = new HashMap<>();
	        for (int i = 0; i < array.length; i++) {
	        	
	        	map.put(array[i], i);
	            if (map.containsKey(target - array[i]))
	            {
	                System.out.printf("Pair found (%d, %d)", array[map.get(target - array[i])], array[i]);
	                return;
	            }
	 
	           
	        }
	        System.out.println("Pair not found");
	    }
	  
	  public static void main (String[] args)
	    {
	        int[] array = { 81, 9, 90, 12, 18, 78 };
	        int target = 90;
	 
	        findPair(array, target);
	    }

}
