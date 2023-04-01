package Arrays;

public class PeakElementOfArray {
public static void main(String[]args) {
	int arr[]= {1,2,3,4,5};
	
	System.out.println(peakElement(arr));
}
public static int peakElement(int[] arr)
{
   int max=0;
   for(int i=0;i<arr.length;i++)
   {
       if(arr[i]>arr[max])
       {
           max=i;
       }
   }
   return max;
}
}
