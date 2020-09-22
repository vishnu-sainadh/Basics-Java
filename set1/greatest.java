package set1;
import java.util.Scanner;
class greatest {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.println("enter three numbers:");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a>b&&a>c)
			System.out.println("a is greatest");
		if(b>a&&b>c)
			System.out.println("b is greatest");
		else 
			System.out.println("c is greatest");
	}

}