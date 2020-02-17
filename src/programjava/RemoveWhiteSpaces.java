package programjava;

public class RemoveWhiteSpaces {
 
	static String str1 = "I am removing white spaces";
	static String emp= " ";
	
	public static void main(String[] args)
	{
		char[] charArray = str1.toCharArray();
		
		System.out.println(charArray);
		
		for (int i=0; i< charArray.length; i++) {
			
			if (charArray[i]!= ' ')
				{
					emp = emp + charArray[i];
				}
			
		}
		
		System.out.println("\n-------------");
		System.out.println(emp);
	}
	}


