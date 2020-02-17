package programjava;

public class Smallestnumber {

	public static void main(String[] args) {
		
		int[] int1 = {23,67,11,66,78,102,92,98};
		int smallest = 0;
		
		for (int k =0; k< int1.length; k++)
			 
		 {
			 for(int l=1 ; l< int1.length; l++) {
				 
			 if (int1[k] < int1[l])
			 {
				 smallest = int1[k];
				
			 }
			 }
		 }
		 System.out.println(smallest);
		 
		 int[] int2 = {34,77,11,35};
		 int temp = 0;
		 
		 for (int a=1;a<int2.length;a++)
			 {
			 if (int2[0] <int2[a]) {
				 
				 temp= int2[0];
				 System.out.println(temp);
			 }else {
				 temp= int2[a];
			 }
		 }
		 System.out.println(temp);

	}

}
