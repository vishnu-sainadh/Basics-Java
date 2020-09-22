package set3;
import java.util.Scanner;
class replace_no_array {
	public static void main(String[] args) {
		int i,n,k;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of values:");
		n=s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements:");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("enter the index to be changed:");
		i=s.nextInt();
		System.out.println("enter the no to replace:");
		k=s.nextInt();
		a[i]=k;
		System.out.println("new values of array are:");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
}
}