package Arrays;

import java.util.HashSet;
import java.util.Set;

public class ArraysDuplicatesUsingSet {
	//Print Duplicates Using Set
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,1,2,3};
	Set<Integer> uniquenumber=new HashSet<Integer>();
	boolean rs=false;
	for (int i = 0; i < arr.length; i++) {
		if(uniquenumber.contains(arr[i]))
		{
			rs=true;
			System.out.println("Duplicate elements "+arr[i]);
		}
		else
		{
			uniquenumber.add(arr[i]);
		}
	}
	if(!rs)
	{
		System.out.println(-1);
	}
}
}
