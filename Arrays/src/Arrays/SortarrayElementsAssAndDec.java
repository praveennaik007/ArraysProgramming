package Arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortarrayElementsAssAndDec {
public static void main(String[] args) {
	String a[]=new String[] {"hari","Raju","Ramu","Rakhi"};
//	System.out.println("Before Sorting ");
//	System.out.println(Arrays.toString(a));
	//Using Classic For loop
	System.out.println("Before Sorting ");
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	//Using Advanced For loop
	System.out.println("Before Sorting ");
	for (String string : a) {
		System.out.println(string);
	}
	
	Arrays.sort(a);
	//Using Classic For loop
	System.out.println("After Sorting ");
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	//Using Advanced For loop
	System.out.println("Afrer Sorting ");
	for (String string : a) {
		System.out.println(string);
	}
	//using Classic For loop
	System.out.println("After Sorting Desending Order(Reverse) ");
	Arrays.sort(a, Collections.reverseOrder());
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	//using Advanced For loop
	System.out.println("After Sorting Desending Order(Reverse) ");
	for (String string : a) {
		System.out.println(string);
	}
}
}
