package programjava;

public class DuplicateChars {

	public static void main(String[] args) {
		
		String str = "better butter";
		
		char[] charArray = str.toCharArray();
		int count = 0;
		for (int i = 0; i< charArray.length; i++) 
		{
		
			for( int j=1; j< charArray.length; j++)
			{
				if (charArray[i]==charArray[j])
				{
					count++;
					break;
				}
		}
			System.out.println(count);
		
	}

}}
