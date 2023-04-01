package Arrays;

public class MaximumSubArraySum {
public static void main(String[] args) {
	int arr[]= {1,2,-5,4,3,8,5};
	int result = findMaxSubArraySum(arr);
	System.out.println(result);
	
}

private static int findMaxSubArraySum(int[] arr) {
	int maxsum=arr[0];
	int sum=arr[0];
	for (int i = 0; i < arr.length; i++) {
		if(sum < 0)
		{
			sum=arr[i];
		}
		else
		{
			sum=sum+arr[i];
		}
		maxsum=Math.max(sum, maxsum);
	}
	return maxsum;
	
}
}
