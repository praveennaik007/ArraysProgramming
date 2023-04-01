package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SecondHighestElement {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size ");
	int n=sc.nextInt();
	int a[]=new int[n];
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	Arrays.sort(a);
	for (int i = 0; i < n; i++) {
		System.out.println(a[n-1]);
	}
//	int a[]= {1,13,2,56,4,5,8,45,67,85,23,98,65};
	
	
	System.out.println(Arrays.toString(a));
	System.out.println("== 1st highest number ==");
	System.out.println(a[a.length-1]);
	System.out.println("== Second Highest number ==");
	System.out.println(a[a.length-2]);
	System.out.println("== Third Highst number ==");
	System.out.println(a[a.length-3]);
}
}
