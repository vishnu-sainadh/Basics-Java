package set2;
import java.util.Scanner;
class star1 {

	public static void main(String[] args) {
		int a,i,j;
		Scanner s = new Scanner(System.in);
		System.out.println("enter number of rows:");
		a=s.nextInt();
		for(i=0;i<a;i++)
		{
			for(j=0;j<=i;j++)
			{
			System.out.print("* ");
			}
			System.out.println();
	     }
     }
}