package smallOnes;

public class CountOccurance {

	      
	    static int getOccurence(int k, int n) 
	    { 
	          
	        // Initialize result 
	        int result = 0; 
	      
	        // Count appearances in numbers 
	        // starting from d. 
	       int p = k; 
	          
	        while (p <= n) 
	        { 
	              
	            // When the last digit is 
	            // equal to d 
	            if (p % 10 == k) 
	                result++; 
	      
	            // When the first digit is 
	            // equal to d then 
	            if (p != 0 && p/10 == k) 
	            { 	                  
	                // increment result as 
	                // well as number 
	                result++; 
	                p++; 
	            } 
	      
	            // In case of reverse of number  
	            // such as 12 and 21 
	            else if (p/10 == k-1) 
	                p = p + (10 - k); 
	            else
	                p = p + 10; 
	        } 
	          
	        return result; 
	    } 
	  
	      
	    // Driver code 
	    public static void main (String[] args) 
	    { 
	        //int n = 11, d = 1; 
	      
	        System.out.println(getOccurence(2, 35) ); 
	    } 
	} 


