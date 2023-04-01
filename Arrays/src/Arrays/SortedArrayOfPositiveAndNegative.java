package Arrays;

public class SortedArrayOfPositiveAndNegative {
public static void main(String[] args) {
	int a[] = {-6,-1,2,3,5};

	int squareArray[] =SortedArrayOfPositiveAndNegative(a);
	for (int i = 0; i < squareArray.length; i++) {
		System.out.println(squareArray[i]);
	}
	
}

private static int[] SortedArrayOfPositiveAndNegative(int[] a) {
	int squareArray []=new int[a.length];
	int start=0;
	int end=a.length-1;
	int squareIndex=a.length-1;
	while(start<=end)
	{
		if(a[start]*a[start]>a[end]*a[end])
		{
			squareArray[squareIndex--]=a[start]*a[start];
			start++;
		}
		else
		{
			squareArray[squareIndex--]=a[end]*a[end];
		end--;
	}
	}
	
	return squareArray;
}
}
