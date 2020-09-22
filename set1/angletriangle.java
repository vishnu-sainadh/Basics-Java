package set1;
import java.util.*;
class angletriangle {
	public static void main(String[] args) {
		int a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.println("enter three angles:");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a+b+c==180)
			System.out.println("triangle");
		else 
			System.out.println("not triangle");
	}

}