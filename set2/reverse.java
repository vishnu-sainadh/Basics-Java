package set2;
import java.util.Scanner;
public class reverse {
	 public static void main(String[] args) {
			int num,reverse=0;
			Scanner s = new Scanner(System.in);
			System.out.println("enter a number:");
			num=s.nextInt();
			 while(num != 0)
			    {
			        reverse = (reverse * 10) + (num % 10);
			        num /= 10;
			    }
			 System.out.println("Reverse ="+reverse);
	}
}
