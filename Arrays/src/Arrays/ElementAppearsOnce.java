package Arrays;

public class ElementAppearsOnce {
public static void main(String[] args) {
	int arr[]= {1,1,2,3,3,4,4,5,5};
	int result = singleNonDuplicateUsingXor(arr);
	System.out.println(result);
}

private static int singleNonDuplicateUsingXor(int[] arr) {
	int res=0;
	for (int i : arr) {
		res^=i;
	}
	return res;
}
}
