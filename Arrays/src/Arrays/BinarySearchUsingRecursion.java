package Arrays;

public class BinarySearchUsingRecursion {
	//Binary Search Using Recursion
	static int binary(int a[],int low,int high,int key)
	 {
		 
		 while(low<high)
		 {
			 int mid=(low+high)/2;
			 if(key==a[mid])
			 {
				return mid;
				
			 }
			 else if(key<a[mid])
			 {
				return binary( a, low, mid-1, key);
				 
			 }
			 else if(key>a[mid])
			 {
				 return binary( a, mid+1, high, key);
						 
			 }
					 
		 }
		 return 0;
		 
	 }
	public static void main(String[] args) {
       int a[]= {34,56,23,45,56,45};
       int key=56;
       int ind=binary(a,0,a.length-1,key);
       System.out.println(ind);
	}
}
