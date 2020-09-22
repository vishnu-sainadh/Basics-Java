package set2;
import java.util.Scanner;
class multiplication_table {
	public static void main(String[] args) {
		 int i, num;
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter number to print table: ");
		 num=s.nextInt();
		    for(i=1; i<=10; i++)
		    {
		    	System.out.println(num*i);
		    }
	}
}
