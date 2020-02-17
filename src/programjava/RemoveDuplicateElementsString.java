package programjava;

public class RemoveDuplicateElementsString {

	public static void main(String[] args) {

		String str1 = "abcbc" ; int count = 0;
		
		char[] str = str1.toCharArray();
		
		for (int i =0; i <str.length; i++)
		{
			for (int j =i+1; j< str.length ; j++)
			{
				if(str[i] == str[j])
				{
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
