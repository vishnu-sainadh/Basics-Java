package set3;
import java.util.Scanner;
public class search_element {
	public static void main(String[] args) {
	int i,n,element;
	Scanner s = new Scanner(System.in);
	System.out.println("enter the number of values:");
	n=s.nextInt();
	int a[] = new int[n];
	System.out.println("Enter all the elements:");
	for(i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	System.out.println("enter the elements to be searched:");
	element=s.nextInt();
	for(i=0;i<n;i++)
	{
		if(a[i]==element)
		{
			System.out.println("element found in "+i+" index postion");
		break;
		}
	}
	if(i==n)
		System.out.println("element not found");
	}
}
