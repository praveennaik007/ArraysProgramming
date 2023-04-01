package Arrays;

import java.util.Arrays;

public class DeleteSpecificIndex {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int b[]=new int[a.length-1];
	int index=2;
	int k=0;
	for (int i = 0; i < a.length; i++) {
		if(i==index)
		{

		continue;
		}
		b[k++]=a[i];
	}
	System.out.println(Arrays.toString(b));
}
}
