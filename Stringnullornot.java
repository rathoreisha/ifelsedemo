package ifelseproject;

public class Stringnullornot {
	
	 public static boolean isStringNull(String str)
	    {
	  
	        if (str == null)
	            return true;
	        else
	            return false;
	    }
	  
	    // Driver code
	    public static void main(String[] args)
	    {
	        String str1 = "GeeksforGeeks";
	        String str2 = null;
	  
	        System.out.println("Is string [" + str1
	                           + "] null? "
	                           + isStringNull(str1));
	        System.out.println("Is string [" + str2
	                           + "] null? "
	                           + isStringNull(str2));
	    }

}
