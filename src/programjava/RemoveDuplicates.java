package programjava;//remove duplicate elements from an array

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int[] int1 = {23, 45, 56, 34, 23, 45, 55};
		
		int[] int2= {0}; int temp=0;
		
		System.out.println("the length of int1 array is : "+int1.length);
		
		System.out.println("The given array is :");
		
		for(int k = 0; k<int1.length; k++)
			
			
			System.out.print( int1[k]);
		
		System.out.println("\n the array after removing common elements are: ");
		
	
		for (int i =0; i<int1.length; i++)
			
			{
				for(int j= i+1; j< int1.length; j++)
				{
				if ( int1[i]==int1[j])
					
				{	
					int1[i]=0;
					int1[j]=0;	
			
				}
				}
				
			}
		
		
		for(int k = 0; k<int1.length; k++)	
			{
			if(int1[k]!=0)
			{
			 System.out.println(int1[k]);
				}
				}
		
	}
}


