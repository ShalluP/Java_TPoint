package Arrays;

public class ElementsAtEvenPosition {

	public static void main(String[] args) {

		int[] int1 = {1,2,3,4,5,6,7,8,9};
		System.out.println("The given array is : ");
		for (int i = 1; i < int1.length; i++)
			
		{
			System.out.println(int1[i]);
		}
		
		System.out.println("the elements at even position are: ");
		for (int i = 1; i < int1.length; i = i+2) 
			
		{ 
			System.out.println(int1[i]);
		}
		
		
	}
}
