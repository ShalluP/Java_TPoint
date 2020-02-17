package Arrays;

public class FrequencyOfEachElement {

	public static void main(String[] args)
	
	{	
		int[] intr1 = {3,4,5,7,8,5,4,9}; // initializing array
		
		int[] fr = new int[intr1.length]; // creating array fr to store the frequency
		
		int visited = -1;
		
		for(int i =0; i< intr1.length; i++)
		 {
			int count = 1;
		 		
			for(int j = i+1; j < intr1.length; j++)
				
			{	
				if (intr1[i] == intr1[j])
			{
				count++;
				fr[j] = visited;
			}
		 }
		
			if(fr[i]!= visited)
			{
				fr[i] = count;
			}
		
	}
	System.out.println("--------------------");
	System.out.println("elements| frequency");
	System.out.println("--------------------");
	for (int i =0; i< fr.length; i++)
	{
		if(fr[i]!= visited)
		{
			System.out.println("     "+ intr1[i]+ "     "+ fr[i]);
		}
	}


}
}

