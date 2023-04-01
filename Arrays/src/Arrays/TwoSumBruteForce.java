package Arrays;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class TwoSumBruteForce {
public static void main(String[] args) {
int arr[]= {2,7,11,15};
int sum=18;
		System.out.println(Arrays.toString(twoSumBrute(arr,sum)));
		System.out.println(Arrays.toString(twoSum(arr,sum)));
		
}

private static int[] twoSum(int[] arr, int sum) {
		Map<Integer, Integer> m= new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			m.put(arr[i], arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			int find= sum -arr[i];
			if(m.containsKey(find) && m.get(find)!=i)
			{
				return new int[] {arr[i], m.get(find)};
			}
		}
		throw new IllegalArgumentException("No pairs is found");
		}

private static int[] twoSumBrute(int[] arr, int sum) {
	
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j] == (sum - arr[i]))
				{
					return new int[] {arr[i],arr[j]};
				}
			}
		} 
		throw new IllegalArgumentException("No pairs is found");
}

 
}
