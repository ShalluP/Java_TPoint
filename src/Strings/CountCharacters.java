package Strings;

public class CountCharacters {

	public static void main(String[] args) {
	
		String str1 = "Jeevan jyoti" ;
		int count = 0;
		
		for (int i =0; i< str1.length(); i++)
		{
			if (str1.charAt(i)!=' ')
			{
				count++;
			}
		}
		
		System.out.println("no of characters in the string are: "+ count);
		
	}

}