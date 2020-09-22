package set3;
import java.util.Scanner;
class reading_array_elements {
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
		System.out.println("entered values are:");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}
