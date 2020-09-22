package classes_and_objects;

import java.util.*;

class fraction {
	int num, denum;

	fraction(int x, int y) {
		num = x;
		denum = y;
	}

	fraction() {
	}

	fraction add_fraction(fraction f2) {
		fraction temp = new fraction();
		temp.num = this.num + f2.num;
		temp.denum = this.denum;
		System.out.println("Addition of these fractions is =" + temp.num + "/" + temp.denum);
		return temp;
	}

	void sub_fraction(fraction f2) {
		fraction temp = new fraction();
		temp.num = this.num - f2.num;
		temp.denum = this.denum;
		System.out.println("Subtraction of these fractions is =" + temp.num + "/" + temp.denum);
	}

	void div_fraction(fraction f2) {
		fraction temp = new fraction();
		temp.num = this.num * f2.denum;
		temp.denum = this.denum * f2.num;
		System.out.println("Division of these fractions is = " + temp.num + "/" + temp.denum);
	}

	void mul_fraction(fraction f2) {
		fraction temp = new fraction();
		temp.num = this.num * f2.num;
		temp.denum = this.denum * this.num;
		System.out.println("Subtraction of these fractions is = " + temp.num + "/" + temp.denum);
	}
}

public class fractionmain {
	public static void main(String[] args) {
		fraction a = new fraction();
		fraction b = new fraction(4, 5);
		System.out.println("enter the num and denum:");
		Scanner scan = new Scanner(System.in);
		a.num = scan.nextInt();
		a.denum = scan.nextInt();
		a.add_fraction(b);
		a.div_fraction(b);
		a.mul_fraction(b);
		a.sub_fraction(b);
	}
}
