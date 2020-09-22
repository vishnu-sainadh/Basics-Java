package set3;
import java.util.Scanner;
public class occurences_array {
	public static void main(String[] args) {
		int i,n,k,count=0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of values:");
		n=s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements:");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("enter the number to be checked:");
		k=s.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==k)
			count++;
		}
		System.out.println("the no of occurences are:"+count);
	}
}
