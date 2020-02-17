package programjava;//Take an array and sort it ascending order

public class SortArrayDescendOrder {

	public static void main(String[] args) {
		int i = 0;int j = 0; int temp = 0;
		int[] intr1 = new int[5];
		intr1[0]= 34;
		intr1[1]= 22;
		intr1[2]= 74;
		intr1[3]= 7;
		intr1[4]= 12;
		
		System.out.println("The given array is : "); // Printing the given array
		
		  for (i = 0; i < intr1.length ; i++ ) System.out.println(intr1[i]);
		 
		System.out.println("The array in descending form");
		for (int k=0; k < intr1.length; k++)  // sorting in ascending order
		{
			for(j= k+1 ; j< intr1.length; j++)
			{
				if(intr1[k] < intr1[j])
				{
					temp = intr1[k];
					intr1[k] = intr1[j];
					intr1[j] = temp;
					temp++;
				}
			}
			System.out.println(intr1[k]);
		}
			
	}

}
