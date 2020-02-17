package practisePrograms;

public class Factorial {

	public static void main(String[] args) 
	{
		int n =5 ; int factorial= 1;
		int fact =1; int num = 3; int j=1;
		int number= 4; int factorials =1; int k=1;
		
		  for (int i = 1; i<= n; i++)
		  
		  { factorial = factorial* i; // factorial = 5*4*3*2*1 = 120
		  
		  }
		  
		  System.out.println("the factorial of 5 by for loop is= "+ factorial);
		 System.out.println("\n*****************");
		  
		while(j <= num)
		{
			fact = fact*j;
			j++;
		}
		 System.out.println("factorial of 3 by while loop is= "+ fact);
		
		System.out.println("\n*****************");
		
		do {
			factorials = factorials * k;
			k++;
		   }
		 while(k<= number);
		
				
		System.out.println("THe factorial by do while method is = "+ factorials);
	}

}
