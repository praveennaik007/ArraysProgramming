package Arrays;

public class MoveAllNonNegativeElementsToTheStart {
public static void main(String[] args) {
		
		int a[]= {-1,1,10,20,-2,30,-3};
//		
//		int a1[]=new int [a.length];
//		
//		rearrange(a,a1);
//		
//		print(a1);
//	}
//
//	private static void print(int[] a1) {
//		
//		for(int i :a1)
//		{
//			System.out.print(i);
//			System.out.print(" ");
//		}
//		
//	}
//
//	private static void rearrange(int[] a, int[] a1) {
//	
//		int j=0;
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]>0)
//			{
//				a1[j]=a[i];
//				j++;
//			}
//		}
//		
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]<0)
//			{
//				a1[j]=a[i];
//				j++;
//			}
//		}

		segregateElements(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
public static void segregateElements(int arr[])
{
    int b[]=new int[arr.length];
    int j=0;
  for(int i=0;i<arr.length;i++)
  {
      if(arr[i]>0)
      {
        b[j]=arr[i]; 
        j++;
      }
  }
  for(int i=0;i<arr.length;i++)
  {
      if(arr[i]<0)
      {
          b[j]=arr[i];
          j++;
      }
  }
  for (int i = 0; i < arr.length; i++) {
	arr[i]=b[i];
}
}
}
