package Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumOfAllElementsUsingJav8Streams {
	
	//Sum of Elements Using Java8 Stream 5 Ways 
public static void main(String[] args) {
	int a[] = {2,3,4,5};
	int sum=Arrays.stream(a).sum();
	System.out.println("Using Java8 Arrays.Stream Method.sum Method "+sum);
	System.out.println("Using IntSream.of Method .Sum Method "+IntStream.of(a).sum());
	System.out.println(Arrays.stream(a).reduce((x,y)->x+y).getAsInt());
	System.out.println(Arrays.stream(a).reduce(Integer::sum).getAsInt());
	System.out.println(Arrays.stream(a).summaryStatistics().getSum());
	
}
}
