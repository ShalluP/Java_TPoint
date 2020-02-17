package programjava;// find the common string in the two string arrays

public class CommonString {

	public static void main(String[] args) {
		
		String[] str1 = {"abc","cde","fgh","jkl"};
		String[] str2 = {"jqm","cde","pqr","jkl", "lmn"};
		
		System.out.println("the first string is: ");
		for (int i =0; i< str1.length; i++)
			System.out.println(str1[i]);
		
		System.out.println("the second string is ");
		for (int j=0;j< str2.length; j++)
			System.out.println( str2[j]);
		
		System.out.println("\n the common strings are: ");
		for (int i =0; i< str1.length; i++)
		{
			for (int j=0;j< str2.length; j++)
			{
				if(str1[i]== str2[j])
				{
					System.out.println("\n"+str1[i]);
				}
			}
			
		}
		
	}

}
