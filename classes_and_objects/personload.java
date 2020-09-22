package classes_and_objects;

import java.util.*;

class person {
	String haircolor, eyecolor, skincolor;
	double height, weight;

	person(String a, String b, String c, double d, int e) {
		haircolor = a;
		eyecolor = b;
		skincolor = c;
		height = d;
		weight = e;
	}

	void display() {
		System.out.println("Haircolor = " + haircolor + ",Eyecolor = " + eyecolor + ",Skincolor = " + skincolor
				+ ",Height = " + height + ",weight = " + weight);
	}

	void read() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter which book you want to read :");
		String f = sc.next();
		System.out.println("your book is here you can read it now");
	}

	void play() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the game you want to play");
		String g = sc.next();
		System.out.println("Loading your game.... ");
	}

	void sleep() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many hours you want to sleep :");
		int h = sc.nextInt();
		System.out.println("set an alarm after" + h + "hours");
	}

	void walk() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the place you want to walk :");
		String d = sc.next();
		System.out.println("the distance to that palce is....");
	}
}

public class personload {
	public static void main(String args[]) {
		person boy = new person("Black", "Black", "Fair", 5.10, 65);
		person girl = new person("Brown", "Brown", "Milky", 5.4, 50);
		{
			System.out.println("These are the properties of boy:");
			boy.display();
			boy.read();
			boy.play();
			boy.sleep();
			boy.walk();
			System.out.println("These are the properties of girl:");
			girl.display();
			girl.read();
			girl.play();
			girl.sleep();
			girl.walk();
		}
	}
}
