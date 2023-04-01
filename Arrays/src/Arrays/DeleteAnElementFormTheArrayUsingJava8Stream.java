package Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DeleteAnElementFormTheArrayUsingJava8Stream {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6};
	System.out.println("Original Array "+Arrays.toString(a));
	int index=3;
	int [] newArray=IntStream.range(0, a.length).filter(i->i!=index).map(i->a[i]).toArray();
	System.out.println("New Array "+Arrays.toString(newArray));
}
}
