package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseElementsUsingCollections {
public static void main(String[] args) {
	List l=new ArrayList();
	l.add(1);
	l.add(2);
	l.add(3);
	System.out.println("Before Reversing ");
	System.out.println(l);
	System.out.println("After Reversing ");
	Collections.reverse(l);
	System.out.println(l);
}
}
