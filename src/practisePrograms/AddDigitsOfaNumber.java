package practisePrograms;

public class AddDigitsOfaNumber {

	public static void main(String[] args) {
		int sum = 0;
		
		
		  System.out.println("the no at units palce is j");
		  System.out.println("the no at tens place is i");
		  
		  for (int i= 1; i<= 100; i++) { for (int j= 1; j< 10; j++) { sum = (i*10)+j;
		  
		  System.out.println("the sum is =" + sum); }
		  
		  }
		 
		 System.out.println("\n*****do while loop execution as follows*********");
		 int k= 1; int l = 1;
		 //if(k<=100) 
		do { 
		 do {
			 
			 {sum =(k*10)+(l*1);
			  l++;
			 System.out.println("the sum is ="+ sum);
			 }
			 k++; 
		 }
		
		 while(l<=10);
		 
		
		 System.out.println(k);}
		 while(k<10);
		
		
		 
	}

}
