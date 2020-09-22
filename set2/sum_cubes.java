package set2;
import java.util.Scanner;
class sum_cubes {
	  public static void main(String[] args) {
		  int n,i;
			int sum=0;
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the n i.e. max values of series: ");
			n=s.nextInt();
			sum = (int)Math.pow(((n * (n + 1) ) / 2),2);
			System.out.println("Sum of the series : "+sum);
	}
}
