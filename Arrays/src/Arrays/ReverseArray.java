package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
public static void main(String[] args) {
//	Scanner sc= new Scanner(System.in);
//	System.out.println("Enter the size ");
//	int n=sc.nextInt();
//	int a[]=new int[n];
//	System.out.println("enter the elements ");
//	for (int i = 0; i < a.length; i++) {
//		a[i]=sc.nextInt();
//	}
//	System.out.println("Print Reverse Element In An Array ");
	String s="for";
	String rev="";
	char ch[]=s.toCharArray();
	for (int i = ch.length-1; i >=0; i--) {
		
		rev+=ch[i];
	}
	System.out.println(rev);
	
}
}
