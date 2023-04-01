package Arrays;

public class MaxMinSubArray {
public static void main(String[] args) {
	int arr[]= {2,1,5,1,3,2};
	int k=3;
	int result = getSum(arr,k);
	System.out.println(result);
}

private static int getSum(int[] arr, int k) {
	int start =0;
	int sum=0;
	int maxsum=0;
	for (int i = 0; i < arr.length; i++) {
		sum=sum+arr[i];
		if(i >= k-1)
		{
			maxsum = Math.max(sum, maxsum);
			sum=sum+arr[start];
			start++;
		}
	}
	return maxsum;
}
}
