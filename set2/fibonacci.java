package set2;
import java.util.Scanner;
class fibonacci {
        public static void main(String[] args) {
		int terms,b,a,i,sum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter number of terms:");
		terms=s.nextInt();
		a=0;
		b=1;
		System.out.println("fibonacci series:");
		 for(i=1; i<=terms; i++)
		    {
			 System.out.println(sum);

		        a = b;    
		        b = sum;     
		        sum = a + b; 
		    }
     }
}