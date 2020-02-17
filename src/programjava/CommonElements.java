package programjava;//find common elements in an integer array

public class CommonElements {

	public static void main(String[] args) {
		

		int[] int1 = new int[8];
		int1[0] = 31;
		int1[1] = 14;
		int1[2] = 12;
		int1[3] = 13;
		int1[4] = 13;
		int1[5] = 23;
		int1[6] = 33;
		int1[7] = 23;
		
		System.out.println("the length of int1 array is : "+int1.length);
		
		System.out.println("The given array is :");
		
		for(int k = 0; k<int1.length; k++)
			
			System.out.println( int1[k]);
		
		System.out.println("\n the common elements are: ");
		
		for (int i =0; i<int1.length; i++)
			
			{
				for(int j= i+1; j< int1.length; j++)
				{
				if ( int1[i]==int1[j])
				{
					System.out.println(" "+ int1[i]);
				
				}
				
			}
		}
		
	}

}
