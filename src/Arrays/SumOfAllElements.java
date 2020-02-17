package Arrays;

public class SumOfAllElements {

	public static void main(String[] args) {
		
		int sum = 0; 

		int[] intr1 = {3,4,3,7}; // initializing array
		
		System.out.println("The given array is : ");
		for (int i = 0; i < intr1.length; i++)
			
		{
			System.out.println(intr1[i]);
		}
		System.out.println("the sum of elements of an array is : ");
	
		for (int i = 0; i < intr1.length ; i++)
		{
			sum = sum + intr1[i];
			
		}
		System.out.println( sum);
		
		
	}
}
