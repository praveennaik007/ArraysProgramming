package Arrays;

import java.util.Scanner;

public class SumOfArrayUsingNormalWay {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size ");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("Enter the elements ");
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	int sum=0;
	for (int i = 0; i < a.length; i++) {
		sum+=a[i];
	}
	System.out.println("Sum = "+sum);
}
}
