package programjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateElementsArrayList {

	public static void main(String[] args) {
		
		//int[] intr1 = {34,45,67,88,34,78,88}; // array of integers
		String[] str1 = {"this ","home","is","my","home"};
 
		List st = Arrays.asList(str1);
		//List<Integer> intr2 = Arrays.asList(intr1);
		System.out.println("the string in list format is : "+st);
		
		 Set<String> set = new HashSet<String>(st); // set hashSet of list str
		System.out.println(set);
	}
	}


