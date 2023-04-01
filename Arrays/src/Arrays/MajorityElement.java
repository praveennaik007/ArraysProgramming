package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElement {
public static void main(String[] args) {
	int a[]= {10,20,10,20,20,40};
	Map<Integer, Integer> m=new HashMap<Integer, Integer>();
	for (int i = 0; i < a.length; i++) {
		m.put(a[i], m.getOrDefault(a[i], 0)+1);
	}
	for (Entry<Integer, Integer> entry : m.entrySet()) {
		
		if(entry.getValue()==a.length/2)
		{
			int res=entry.getKey();
			System.out.println(res);
		}
	}
}
}
