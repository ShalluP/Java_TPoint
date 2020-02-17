package Arrays;

public class CopyFromOneToAnother {

	public static void main(String[] args) {

		String[] str1 = {"Ram", "Sham", "Lakshman","Bharat","Shatrughan"};
		
		String str2[] = new String[str1.length];
		
		for(int i =0; i< str1.length; i++)
		{
			str2[i] = str1[i];
		}
		
		for(int i =0; i< str1.length; i++)
		System.out.println(str2[i]);
	}

}
