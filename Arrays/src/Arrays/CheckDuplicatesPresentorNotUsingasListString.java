package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckDuplicatesPresentorNotUsingasListString {
public static void main(String[] args) {
	String a[]= {"a","b","c","d","a","b"};
	List duplist=Arrays.asList(a);
	Set dupset=new HashSet();
	if(duplist!=dupset)
	{
		System.out.println("The Arrays Contains Duplicates ");
	}
	else
	{
		System.out.println("The Arrays Does not contains Duplicates ");
	}
}
}
