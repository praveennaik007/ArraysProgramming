package Arrays;

import java.util.Scanner;

public class SortingNameInArray {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Size of The String Elements ");
	int n=sc.nextInt();
	String s[]=new String[n];
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter the String names ");
	
	for (int i = 0; i < n; i++) {
		s[i]=sc1.nextLine();
	}
	String temp;
	for (int i = 0; i < n; i++) {
		for (int j = i+1; j < n; j++) {
			if(s[i].compareTo(s[j])>0)
			{
				temp=s[i];
				s[i]=s[j];
				s[j]=temp;
			}
		}
	}
	for (String str : s) {
		System.out.println("Sorted Array is "+str);
	}
}
}
