package Arrays;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDuplicatesAnArrayUsingMap {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,1,4};
	Map<Integer, Integer> m=new LinkedHashMap<Integer, Integer>();
	
	for (int i = 0; i < arr.length; i++) {
		if(m.containsKey(arr[i]))
		{
			m.put(arr[i], m.get(arr[i])+1);
		}
		else
		{
			m.put(arr[i], 1);
		}
	}
	
	for (Entry<Integer, Integer> entry : m.entrySet()) {
		if(entry.getValue() >= 1)
		{
			System.out.println("After removing the duplicate elements "+entry.getKey());
		}
		
	}
	System.out.println();
	// Find All Duplicates In Array
	System.out.println("Find All Duplicates present In Array");
	Set<Integer> s=new HashSet<Integer>();
	for (int i = 0; i < arr.length; i++) {
		if(s.contains(arr[i]))
		{
			System.out.println(arr[i]);
		}
		else
		{
			s.add(arr[i]);
		}
	}
	
	
	
	
}
}
