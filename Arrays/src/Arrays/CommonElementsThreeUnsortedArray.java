package Arrays;

public class CommonElementsThreeUnsortedArray {
public static void main(String[] args) {
	int arr1[]= {1,2,3,4,5};
	int arr2[]= {6,7,2,80,4,10};
	int arr3[]= {3,4,15,2,30,70,14,120};
	
	for (int i = 0; i < arr1.length; i++) {
		for (int j = 0; j < arr2.length; j++) {
			if(arr1[i]==arr2[j])
			{
				for (int k = 0; k < arr3.length; k++) {
					if(arr1[i]==arr3[k])
					{
						System.out.println(arr1[i]);
					}
				}
			}
		}
	}
}
}
