package set1;
import java.util.Scanner;
class divisible5and11 {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number:");
		n=s.nextInt();
		if(n%5==0&&n%11==0)
			System.out.println("divisible by 5 and 11");
		else
			System.out.println("not divisible by 5 and 11");
	}

}