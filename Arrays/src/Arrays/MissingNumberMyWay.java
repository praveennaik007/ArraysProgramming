package Arrays;

public class MissingNumberMyWay {
public static void main(String[] args) {
	int array[]= {1,2,3,5};
	int n=array.length+1;
	//System.out.println(n);
	System.out.println(MissingNumber(array, n));
}
public static int MissingNumber(int array[], int n) {
    int sum=0;
    int sum1=(n*(n+1)/2);
    for(int i=0;i<array.length;i++)
    {
        sum+=array[i];
    }
    return sum1-sum;
}
}
