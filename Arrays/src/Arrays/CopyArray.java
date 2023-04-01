package Arrays;

public class CopyArray {
public static void main(String[] args) {
	int a[]= {1,2,3,4};
	int newarr[]=new int[a.length];
	for (int i = 0; i < a.length; i++) {
		newarr[i]=a[i];
	}
	for (int i = 0; i < newarr.length; i++) {
		System.out.println(newarr[i]);
	}
}
}
