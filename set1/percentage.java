package set1;
import java.util.Scanner;
class percentage {
	public static void main(String[] args) {
		int maths,biology,chemistry,english,physics,sum,percentage;
		Scanner s = new Scanner(System.in);
		System.out.println("enter maths marks:");
		maths=s.nextInt();
		System.out.println("enter biology marks:");
		biology=s.nextInt();
		System.out.println("enter chemistry marks:");
		chemistry=s.nextInt();
		System.out.println("enter english marks:");
		english=s.nextInt();
		System.out.println("enter physics marks:");
		physics=s.nextInt();
		sum=maths+biology+chemistry+english+physics;
		percentage=sum/5;
		if (percentage>=90)
			System.out.println(" gradeA");
		else if (percentage>=80)
			System.out.println("gradeB");
		else if (percentage>=70)
			System.out.println("gradeC");
		else if (percentage>=60)
			System.out.println("gradeD");
		else if (percentage>=50)
			System.out.println("gradeE");
		else if (percentage>=40)
			System.out.println("gradeF");
		else
			System.out.println("FAIL");
	}
}