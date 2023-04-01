package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteAnElementUsingCollections {
	public static void main(String[] args) {
		 //Integer a[]= {1,2,3,4,5};
		 String s[] = {"Hero","Zero","Barrow"};
/*List<String> l1=Arrays.asList(s);//It throws an Exception 
  java.lang.unsupportedOperationException 
 It Shows java.util.AbstractList.remove(Unknown Source)
  */
		 List<String> l=new ArrayList<String>( Arrays.asList(s));
		 l.remove(2);
		 l.remove("Zero");
		 System.out.println(l);
	}

}
