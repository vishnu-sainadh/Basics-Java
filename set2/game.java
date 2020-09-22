package set2;
import java.util.Scanner;
public class game {
		public static void main(String[] args) {
		int a=300;
		int c=0,i;
		System.out.println("Enter the target number : ");
		Scanner num=new Scanner(System.in);
		i=num.nextInt();
		while(i!=a)
		    {
		if(i<a)
		System.out.println("Too low ,try again ");
		else
		System.out.println("Too high ,try again");
		c=c+1;
		System.out.println(" Enter the target number : ");
		i=num.nextInt();
		    }
		    if(i==a)
		    {
		        System.out.println("   YOU WON  ");
		        c=c+1;
		    }
		    System.out.println("Total trails are : "+c);
		}
}