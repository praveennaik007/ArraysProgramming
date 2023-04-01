package Arrays;

import java.util.Arrays;

public class Sort0s1s2sInArray {
public static void main(String[] args) {
	int a[]= {0,2,1,2,0};
	sort012(a);
for (int i = 0; i < a.length; i++) {
	System.out.println(a[i]);
}
}
public static void sort012(int a[])
{
   Arrays.sort(a); 
}
}
