package Arrays;

import java.util.Arrays;

public class CopyArrayInbuilt {
public static void main(String[] args) {
	int a[]= {1,2,3,4};
	
	int newarr[]=Arrays.copyOf(a, a.length);
	
	for (int i = 0; i < newarr.length; i++) {
		System.out.println(newarr[i]);
	}
}
}
