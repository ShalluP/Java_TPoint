package Arrays;

public class ReverseOrder {

	public static void main(String[] args) {
		
		int int1[] = {1,2,3,4,5};
		System.out.println("the given array is :");
		for (int i = 0; i < int1.length; i++)
		{
			System.out.println(int1[i]);
		}
		System.out.println("\n The array in reverse order is : ");
		for (int i =int1.length-1; i>= 0; i--)
		{
			System.out.println(int1[i]);
		}
	}

}
