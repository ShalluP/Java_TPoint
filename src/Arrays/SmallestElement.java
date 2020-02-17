package Arrays;

public class SmallestElement {

	public static void main(String[] args)
	{
		int largest =0;
		int intr1[] = {12,34,56,32,89,22,14,78};
		
		System.out.println("The given array is as: ");
		
		for (int i = 0; i< intr1.length; i++)
		{
			System.out.println(intr1[i]);
		}
		
		System.out.println("The elements in the array are in ascending order : ");
		
		for (int i = 0; i< intr1.length; i++)
		{
			for (int j = i+1 ; j < intr1.length; j++)
			{
				if (intr1[i] > intr1[j])
				{
					largest = intr1[i]; // largest of 2 ko temp mei rakha,i th locatn free ho gyi
					intr1[i] = intr1[j];// smallest wala dono mei se i th pe move kr diya, sbse aage samllest no aa gya 
					intr1[j] = largest; // largest or temp location wala jth p move kr diya
					largest++; // temp ko aage move kr diya
				}
				
			}
		}
		for (int i = 0; i< intr1.length; i++)
		System.out.println( intr1[i]);
		System.out.println("the smallest element is :" + intr1[0]);

		
		
		
		
		
	}

}
