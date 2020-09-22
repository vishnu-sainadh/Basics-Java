package set2;
import java.util.Scanner;
class sumofN {
        public static void main(String[] args) {
		int a,i,sum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number:");
		a=s.nextInt();
		for(i=0;i<=a;i++)
		{
			sum=sum+i;
	     }
		System.out.println("sum="+sum);
     }
}