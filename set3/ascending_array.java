package set3;
import java.util.Scanner;
public class ascending_array {
	public static void main(String[] args) {
		int i,size,j,temp;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of values:");
		size=s.nextInt();
		int a[] = new int[size];
		System.out.println("Enter all the elements:");
		for(i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0; i<size; i++)
	    {
	        for(j=i+1; j<size; j++)
	        {
	            if(a[j] < a[i])
	            {
	                temp = a[i];
	                a[i] = a[j];
	                a[j] = temp;
	            }
	        }
	    }
		System.out.println("Elements of array in sorted ascending order:");
	    for(i=0; i<size; i++)
	    {
	    	System.out.println(a[i]);
	    }
}
}