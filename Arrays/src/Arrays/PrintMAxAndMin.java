package Arrays;

import java.util.Arrays;

public class PrintMAxAndMin {
	public static void main(String[] args) {
     int[] a= {3,5,2,6,4,7};
     int max=a[0];
     int min=a[0];
     
     for(int i=1;i<a.length;i++)
     {
    	 if(a[i]!=max)
    	 {
    		 
    	 }
    	 if(a[i]>max)
    	 {
    		 max=a[i];
    	 }
    	
     }
     for(int i=1;i<a.length;i++)
     {
    	 if(a[i]<min)
    	 {
    		 min=a[i];
    	 }
     }
	
     System.out.println(max);
     System.out.println(min);
		
//		int a[]= {1,1,1,1,1};
//		int x=1;
//		int n=0;
//		for (int i = 0; i < a.length; i++) {
//			if(a[i]==x)
//			{
//				n++;	
//			}
//		}
//		System.out.println(n);
		
		
		
		
	}
	}