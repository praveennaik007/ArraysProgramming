package Arrays;

import java.util.Arrays;

public class Array5WaystoprinttheValues {
public static void main(String[] args) {
	String a[]= {"Hari","Raju","Purushotham"};
	int s[]= {1,2,3,4};
	int n[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
	String str[][]=new String[][] {{"Hari","Raju"},{"Rick","Purushotham"},{"Hemanth","Abdul"}};
	//Using Classic for loop
	System.out.println(a);
	System.out.println("== Using Classic For loop ==");
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	
	//Using Enhanced for loop
	System.out.println("== Using EnhancedFor loop/ForEach Loop  ==");
	for (String string : a) {
		System.out.println(string);
	}
	System.out.println("== Using Arrays.asList Method String Objects ==");
	System.out.println(Arrays.asList(a));
	System.out.println("== Using Arrays.asList Method integer values ==");
	System.out.println(Arrays.asList(s));
	System.out.println("== Using Arrays.toString Method String Objects ==");
	System.out.println(Arrays.toString(a));
	System.out.println("== Using Arrays.toString Method Integer values ==");
	System.out.println(Arrays.toString(s));
	System.out.println("== Using Arrays.deepToString Method Integer values ==");
	System.out.println("== Arrays.deepToString is Used for Two Dimentional Array ==");
	System.out.println(Arrays.deepToString(n));
	System.out.println("== Using Arrays.deepToString Method String Objects ==");
	System.out.println("== Arrays.deepToString is Used for Two Dimentional Array ==");
	System.out.println(Arrays.deepToString(str));
	

	
	
}
}
