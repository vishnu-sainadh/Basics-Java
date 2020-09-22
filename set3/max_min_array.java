package set3;
import java.util.Scanner;
class max_min_array {
	public static void main(String[] args) {
		int i,n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of values:");
		n=s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements:");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int max=a[0];
		for(i=1;i<n;i++)
		{
			if(a[i]>max)
			max=a[i];
		}
		System.out.println("maximum value is:"+max);
			int min=a[0];
		for(i=1;i<n;i++)
		{
			if(a[i]<min)
			min=a[i];
		}
		System.out.println("minimum value is:"+min);
}
}