package pattern;

public class patternprogram1
{  
    public static void pyramidPattern(int num) 
    {  
    		for (int i=1; i<=num; i++) //outer loop for number of rows(n) { for (int j=n-i; j>1; j--) //inner loop for spaces
    		{
	    		for(int j=1; j<=num-i; j++)
				{
	                System.out.print(" "); //print space
				}
	            for (int k=1; k<=(2*i)-1; k++) //inner loop for number of columns
	            { 
	                System.out.print("*"); //print star
	            } 
 
	    		System.out.println();//ending line after each row
	    	} 
    } 
  
    public static void main(String args[]) //driver function
    { 
    	int num=6;
    	pyramidPattern(num);
   
    } 
}