package Arrays;

public class TwoSumArray {
public static void main(String[] args) {
	int a[]= {123,134,145,1,256,689};
	
	for (int i = 0; i < a.length; i++) {
		int n=a[i];
		int sum=0;
		while(n!=0)
		{
			int d=n%10;
			sum+=d;
			n/=10;
		}
		System.out.println(sum);
	}
}
}
