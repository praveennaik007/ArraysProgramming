package Arrays;

public class RepeatingElement {
public static void main(String[] args) {
	int a[]=new int[] {1,2,3,4,1,5,3};
	int temp[]=new int[a.length];
	for(int i=0;i<a.length;i++)
	{
		if(temp[a[i]]==1)
		{
			System.out.println(a[i]);
		}
		else
		{
			temp[a[i]]++;
		}
	}
}
}
