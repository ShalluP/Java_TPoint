package practisePrograms;// Wap to find 10 even and 10 odd numbers

public class EvenOddNumbers {
  
	public static void main(String[] args) {
		
		// for loop
		System.out.println("result of for loop");
		for (int i=1; i<=20; i++) { // taking first 20 numbers
		
		if (i%2 == 0)// condition 1
			
		{System.out.println("the no is even "+ i);} // statements will be executed if 
												// c1 is true	
		
		if(i%2!= 0) // condition 2
			
			{System.out.println("the no is odd "+ i);} // statement block executed if c2 is true
		}
		System.out.println("\n****************");
		System.out.println("result of while loop");
		// while loop
		
		int j=1; int max = 20;
		
		while( j<= max )
			{
				if (j % 2==0)
				{
				System.out.println("the no is even "+ j);
				}
				if (j%2 != 0)
				{
				System.out.println("the no is odd "+ j);
				}
				j++;
		}
		System.out.println("\n****************");
		System.out.println("result of do while loop");
		
		// do while loop
		int k=1;
		do 
		{ if (k%2==0)
			{System.out.println("the no is even "+ k);}
		
		if (k%2 !=0)
			{System.out.println("the no is odd "+ k);}
		k++;
			  }
		while (k<=20);
}
}