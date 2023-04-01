package Arrays;

public class NextGreaterElementArray {
public static void main(String[] args) {
	int a[]= {11,21,13,14,15};
	nexGreaterElement(a);
}

private static void nexGreaterElement(int[] a) {
	int next,i,j;
for (i = 0; i < a.length; i++) {
	 next=-1;
	for ( j = 0; j < a.length; j++) {
		if(a[i]<a[j])
		{
			next=a[j];
			break;
		}
	}
	System.out.println(a[i]+","+next);
}	
}
}
