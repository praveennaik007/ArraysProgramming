package Arrays;
import java.util.HashSet;

public class FirstRepeatingPosition {
	
	//First Repeated Position 
	
public static void main(String[] args) {
	int a[]= {1,2,3,5,3,4,5,6};
	System.out.println(firstRepeated(a));
}
public static int firstRepeated(int a[])
{
	HashSet h1=new HashSet();
	HashSet h2=new HashSet();
	for(Object o:a)
	{
		h2.add(o);
	}
	System.out.println(h2);
	int pos=a.length;
	int pos1=a.length;
	if(h2.size()!=a.length)
	{
		for (int i = a.length-1; i >=0; i--) {
			
			if(h1.contains(a[i]))
			{
				pos = i+1;
			if(pos < pos1)
			{
				pos1 = pos;
			}
			}
			else
			{
				h1.add(a[i]);
			}
		}	
	}
	else
	{
		pos1=-1;
	}
	return pos1; 
}
}
