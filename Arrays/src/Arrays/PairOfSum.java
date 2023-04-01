package Arrays;

public class PairOfSum {
	public static void main(String[] args) {
		int []a= {10,20,30,40,50,60,70,80,90};
		int sum=70;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==sum)
				{
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
	}

}
