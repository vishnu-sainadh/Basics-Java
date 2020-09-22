package set2;
import java.util.Scanner;
public class armstrong {
	 public static void main(String[] args) {
			int n,a,c=0,temp;
			Scanner s = new Scanner(System.in);
			System.out.println("enter a number:");
			n=s.nextInt();
			temp=n;
			while(n>0)  
		    {  
		    a=n%10;  
		    n=n/10;  
		    c=c+(a*a*a);  
		    }  
		    if(temp==c)  
		    System.out.println("armstrong number");   
		    else  
		        System.out.println("Not armstrong number"); 
}
}
