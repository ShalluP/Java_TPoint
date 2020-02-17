package programjava;

public class largetsnumber {

	public static void main(String[] args) {
		
		int[] int1 = {23,67,11,66,78,92,45,98,34};
		 int largest = 0 ; int secondlargest = 0; 
		 
		 System.out.println("the largest no in the array is :");
		 
		 for (int i =0; i< int1.length ; i++)
		 {
			 for (int j= 1; j< int1.length; j++) 
			 {
				 if (int1[i]>int1[j])
					 
				 {
					  largest = int1[i];
				 }
				/*
				 * else if (int1[i]< int1[j]) { secondlargest = int1[i]; }
				 */
			 
			 }
		
			 }
		 
		 System.out.println(largest);
		// System.out.println(secondlargest);
	}

}
