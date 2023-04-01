package Arrays;

public class LargestAndSmallestNumber {
public static void main(String[] args) {
	int a[]=new int[] {1,100,30,20,50};
	int largest=Integer.MIN_VALUE;
	int smallest=Integer.MAX_VALUE;
	for (int i = 0; i < a.length; i++) {
		if(a[i]>largest)
		{
			largest=a[i];
		}	
	}
	System.out.println("Largest Number in an Array = "+largest);
	for (int i = 0; i < a.length; i++) {
		if(a[i]<smallest)
		{
			smallest=a[i];
		}
	}
	System.out.println("Smallest Number in an Array ="+smallest);
}
}
