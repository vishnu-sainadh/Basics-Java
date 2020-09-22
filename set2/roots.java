package set2;
import java.util.Scanner;
class roots {
	 public static void main(String[] args) {
	        double a,b,c;
	        double root1, root2;
	        System.out.println("Enter values of a, b, c of quadratic equation (aX^2 + bX + c): ");
	        Scanner s = new Scanner(System.in);
	        a=s.nextInt();
	        b=s.nextInt();
	        c=s.nextInt();
	        double determinant = (b*b)-(4*a*c);
	        if(determinant > 0) {
	            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
	            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
	            System.out.println("roots are diff and real");
	            System.out.format("root1 = %.2f and root2 = %.2f", root1 , root2);	   
	        }	       
	        else if(determinant == 0) {
	            root1 = root2 = -b / (2 * a);
	            System.out.println("roots are equal and real");
	            System.out.format("root1 = root2 = %.2f;", root1);
	        }       
	        else {
	            double realPart = -b / (2 *a);
	            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);
	            System.out.println("roots are diff and imaginary");
	            System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginaryPart, realPart, imaginaryPart);
	        }
}
}
