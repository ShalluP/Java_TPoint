package programjava;

public class ReverseString {
	static String str = "I am learning Java";
	
		public static void main(String[] args) {
		
				
			//String str = "I am learning Java";
			
			char[] strArray = str.toCharArray();
			
			System.out.println(strArray);
			System.out.println(str.length());
			 
			
			System.out.println("char at index 0 in str is "+str.charAt(0));
			
			for (int i=strArray.length-1 ; i>= 0 ; i-- ) 
				{
				  System.out.print(strArray[i]);
				
				
			//System.out.print("/*************/");
			String str1 = String.valueOf(strArray[i]);
			
			System.out.print(str1);
			 }
		
			//System.out.print(str1.charAt(0));
			
			System.out.println("//*************//");
			StringBuffer str2 = new StringBuffer("I am learning Selenium");
			System.out.println(str2);
			 System.out.println(str2.reverse());
			 
			
				
	}

}
