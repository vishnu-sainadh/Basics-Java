package set1;
import java.util.Scanner;
class sidestriangle {
	public static void main(String[] args) {
		int a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.println("enter three sides:");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a+c>b&&a+b>c&&c+b>a)
			System.out.println("triangle");
		else 
			System.out.println("not triangle");
	}

}