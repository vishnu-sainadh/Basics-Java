package matrix;
import java.util.Scanner;

public class twodbasic {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int i, j, m, n;
		System.out.println("enter the number of rows:");
		m = s.nextInt();
		System.out.println("enter the number of columns:");
		n=s.nextInt();
		int a[][]= new int[m][n];
		System.out.println("Enter the elements:");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("entered values are:");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
	}
}
