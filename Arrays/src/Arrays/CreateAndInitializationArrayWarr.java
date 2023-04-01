package Arrays;

public class CreateAndInitializationArrayWarr {
public static void main(String[] args) {
	Integer a[]=new Integer[5];
	a[0]=1;
	a[1]=4;
	a[2]=6;
	a[3]=23;
	a[4]=56;
//	System.out.println(a.length);
//	System.out.println(a[0]);
//	System.out.println(a[3]);
//	System.out.println(a[4]);
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	for (Integer integer : a) {
		System.out.println(integer);
	}
}
}
