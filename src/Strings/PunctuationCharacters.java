package Strings;

public class PunctuationCharacters {

	public static void main(String[] args) {
	
		String str = "can you ? leave!! the @ world!" ; int count =0;
		
		 for (int i = 0; i< str.length() ; i++)
		 {
			 if (str.charAt(i)=='!'|| str.charAt(i)=='@'||str.charAt(i)=='?')
			 {
				 count++;
				 
			 }
		 }
		 System.out.println("the punctuation count is :"+ count );
	}

}
