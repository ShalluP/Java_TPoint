package practisePrograms;

public class TablesOf10 {

	public static void main(String[] args) {
		 int num = 10; int table =1;
		for (int i = 1; i <= 10; i++) 
		{
			table = num * i;// print result then increment the value of i;
			System.out.println(num+"*"+i+ "="+ table );
		}
		
		System.out.println("\n************using do while******");
		int j=1;
		do {
			table = num*j;
			j++;
			System.out.println(num+"*"+ (j-1) + "="+table);
			}
		
		while (j<=10);
		
		System.out.println("\n************using while loop******");
		int k=1;
		 while (k<=10) 
		 {
			 table = num * k;
			 k++;
			 
			 System.out.println(num+"*"+ (k-1 )+ "="+ table);
		 }
		
	}

}
