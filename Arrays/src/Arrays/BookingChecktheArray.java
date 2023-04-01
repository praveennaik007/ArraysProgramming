package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class BookingChecktheArray {
	//Check the two Arrays elements are present or not
public static void main(String[] args) {
	Integer a[]= {1,2,3,4,5,6};
	Integer b[]= {5,2,7,4,3,10};
	Integer c[]= {1,7,3,2,5,12};
	HashSet<Integer> h=new HashSet<Integer>();
	List<Integer> l1=Arrays.asList(a);
	List<Integer> l2=Arrays.asList(b);
	List<Integer> l3=Arrays.asList(c);
	
	h.addAll(l1);
	h.addAll(l2);
	h.addAll(l3);
	List<Integer> fl=new ArrayList<Integer>();
	for (Integer number : h) {
		if(l1.contains(number)&&l2.contains(number) || l2.contains(number)&&l3.contains(number) ||l3.contains(number) && l1.contains(number))
		{
			fl.add(number);
		}
	}
	System.out.println(fl);
}
}
