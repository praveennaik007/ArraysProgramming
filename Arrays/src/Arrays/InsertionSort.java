package Arrays;

public class InsertionSort {
public static void main(String[] args) {
	int arr[]= {4,7,3,6,2,1};
	int j,temp;
	for (int i = 1; i < arr.length; i++) {
		temp=arr[i];
		j=i-1;
		
		while(j>=0 && temp < arr[j])
		{
			arr[j+1] =arr[j];
			j=j-1;
		}
		arr[j+1] = temp;
	}

	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
}
}
