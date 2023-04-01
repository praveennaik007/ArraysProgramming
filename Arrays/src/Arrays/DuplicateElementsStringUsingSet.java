package Arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsStringUsingSet {
public static void main(String[] args) {
	String a[]=new String[] {"a","b","c","d","a","b"};
	Set nonDup=new HashSet();
	Set dup= new HashSet();
	for (String string : a) {
		if(!nonDup.contains(string))
		{
			nonDup.add(string);
		}
		else
		{
			dup.add(string);	
		}
	}
	System.out.println(dup);
}
}
