package programjava;

import java.util.Arrays;

public class MoveZero{

	static void main(int inputArray[])
	{
		int counter = 0;
		
		for (int i=0; i< inputArray.length; i++) // traversing array from left to right
		{
			if (inputArray[i]!=0) 
			{
				inputArray[counter]= inputArray[i]; //
				counter++; // incrementing counter by 1
			}
			
			while (counter < inputArray.length)
	        {
	            inputArray[counter] = 0;
	 
	            counter++;
	        }
	 
	        System.out.println(Arrays.toString(inputArray));
	    }
		}
	
	public static void main(String[] args)
	{
		MoveZero(new int[] {12, 0, 7, 0, 8, 0, 3});
		 
		MoveZero(new int[] {1, -5, 0, 0, 8, 0, 1});
 
		

	}

}
