package set1;
import java.util.Scanner;
class set1p2{
public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
int a,n,t;
System.out.println("enter value of integer ");
	a=s.nextInt();
System.out.println("enter value of desired bit ");
	n=s.nextInt();
t=n;
n=1<<n;
if((a&n)==n)
System.out.println(t+"bit is a set");
	else
System.out.println(t+" bit is not a set");
}
}
