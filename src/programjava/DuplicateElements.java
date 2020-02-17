package programjava;

public class DuplicateElements {
	
	static void Duplicates(int inputArray[]) {
		
		
	}

	public static void main(String[] args) {
		
		int[] DuplicateElements = {3,4,75,3,4,8,9};
		int count = 0;
		
		for (int i=0; i< DuplicateElements.length; i++)
		
			{
			for (int j= 1 ; j< DuplicateElements.length; j++)
			{
				if(DuplicateElements[i]==DuplicateElements[j]) 
				{
					count = DuplicateElements[i];
					
				}
				//count++;
				//System.out.println(count);
			}
			
		}
		
		System.out.println(count);
	}

}
