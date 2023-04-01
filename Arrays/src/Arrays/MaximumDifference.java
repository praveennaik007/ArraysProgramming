package Arrays;

public class MaximumDifference {
public static void main(String[] args) {
	int[] a= {3,5,2,6,4,7};
    int max=a[0];
    int min=a[0];
    
    for(int i=0;i<a.length;i++)
    {
   	 if(a[i]>max)
   	 {
   		 max=a[i];
   	 }
    }
    for(int i=0;i<a.length;i++)
    {
   	 if(a[i]<min)
   	 {
   		 min=a[i];
   	 }
    }
	
    System.out.println(max);
    System.out.println(min);
	 System.out.println("max diffenrce is "+(max-min));

}
}
