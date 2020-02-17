package Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int[] intr1 = {3,4,5,7,8,5,4,9}; // initializing array
		
		System.out.println("The given array is : ");
		for (int i = 0; i < intr1.length; i++)
			
		{
			System.out.print(intr1[i]+" ");
		}
	
		System.out.println("\n the array after removing duplicates is : ");
		
   for (int i = 1; i < intr1.length; i++)
   { 
	   for (int j =i+1; j< intr1.length; j++)
	   {
		   if (intr1[i] == intr1[j])
		   {
			   intr1[i] = 0;
			   intr1[j] = 0;
		   }
		 		  
		    }
	
      }	
		
   for(int k = 0; k<intr1.length; k++)	
	{
		if(intr1[k]!=0)
		{
		 System.out.println(intr1[k]);
			}
		}

	}

}
