package set3;

import java.util.Scanner;

class AList {

	private static final int SIZE_FACTOR = 10;

	private int data[];

	private int index;

	private int len;

	public AList() {
		this.data = new int[SIZE_FACTOR];
		this.len = 0;
	}

	public void append(int e) {

		if (this.len == this.SIZE_FACTOR) {
			System.out.println(" List is full");
		}
		data[this.len] = e;
		this.len++;

	}

	public void display() {
		if (this.len == 0)
			System.out.println("List is empty");
		else
			for (int i = 0; i < len; i++)
				System.out.println(data[i]);
	}

	public AList makenull() {
		return null;
	}

	void insert(int ele, int pos) throws Exception {
		try {
			if (pos > this.SIZE_FACTOR)
				throw new Exception("ArrayIndexOutOfBound");
			else if (pos < 0)
				throw new Exception("Negative Value");
			else if (pos > this.len - 1)
				data[len++] = ele;
			else {
				for (int i = len - 1; i >= pos; i--) {
					data[i + 1] = data[i];
				}
				data[pos] = ele;
				len++;
			}
		} catch (Exception e) {
			System.out.println(" Try again");
		}

	}
}

public class arraysNEWupdated {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		int e, pos, ch;

		AList mal = new AList();
		do {
			System.out.println("1. append 2. insert  3. Display 4. Exit");
			ch = s.nextInt();
			switch (ch) {
			case 1:
				System.out.println(" Enter the element to be appended");
				mal.append(s.nextInt());
				break;
			case 2:
				System.out.println(" Enter the element to be inserted");
				e = s.nextInt();
				System.out.println("Enter the position ");
				pos = s.nextInt();
				mal.insert(e, pos);
				break;
			case 3:
				mal.display();
			case 4:
				;
			}
		} while (ch != 4);

		System.out.println("ENDING......");

	}
}
