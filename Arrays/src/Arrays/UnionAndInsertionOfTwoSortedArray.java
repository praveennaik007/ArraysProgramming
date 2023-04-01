package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class UnionAndInsertionOfTwoSortedArray {

	public static void main(String[] args) 
	{
//		int a[]= {1,2,3,4,5};
//		Arrays.sort(a);
//		int secmax = a[a.length-2];
//		int c = a.length-1;
//		while(c>=0)
//		{
//			if(a[c] != secmax)
//			{
//				secmax = a[c];
//				break;
//			}
//			c--;
//		}
//		System.out.println(secmax);
		
		
		
//		int a[]={1,2,3,4,5,1,2,3,4,5};
//		int b[]= {1,2,3};
//		int count=0;
//		
//		int sum=a.length+b.length;
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<b.length;j++) {
//			if(a[i]==b[j]) {
//				count++;
//			 }
//			}
//		}
//		
//		System.out.println(sum-count);
//	}
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3};
		System.out.println(doUnion(a, b));
	}	
		public static int doUnion(int a[], int b[]) 
	    {
		HashSet<Integer> k=new HashSet<Integer>();
		for (Integer i : a) {
			k.add(i);
		}
		for (Integer j : b) {
			k.add(j);
		}
		return k.size();	
	}	

}
