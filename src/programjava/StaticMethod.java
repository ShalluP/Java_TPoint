package programjava;


public class StaticMethod {
	
			static int r_no; // creating instance variables of the class; the instance variables are of various data types.
			static int age;
			static String name;
			static String f_name;
			 
			 public  StaticMethod (int r, int a, String n, String f) // Creating a parameterized Constructor with different data type arguments
			 {
				 r_no = r;
				 age = a;
				 f_name = f;
				 name = n;
			 }
			 
			static void display()
			 {
				 System.out.println("the output is : "+ r_no+" " + age+" "+ name+" " + f_name);
			 }
			
			public static void main(String[] args) {

				//Constructors c = new Constructors(23,13,"jaga","Bacha" ); // Object is created and the variables of class are initiated.
				StaticMethod.display();

			}

		


	}


