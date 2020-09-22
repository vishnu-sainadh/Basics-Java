package classes_and_objects;
import java.util.Scanner;
class time {
	int hours, minutes, seconds;
	void settime(int h, int m, int s) {
		hours = h;
		minutes = m;
		seconds = s;
		if (h > -1 && h < 24 && m > -1 && m < 60 && s < -1 && s < 60) {
			System.out.println("THE TIME IS VALID");
		}
	}

	void setHour(int h) {
		if (h > -1 && h < 24) {
			System.out.println("THE TIME IS VALID");
		} else
			System.out.println("INVALID TIME");
	}

	void setMinute(int m) {
		if (m > -1 && m < 60) {
			System.out.println("THE TIME IS VALID ");
		} else
			System.out.println("INVALID TIME");
	}

	void setSecond(int s) {
		if (s > -1 && s < 60) {
			System.out.println("THE TIME IS VALID ");
		} else
			System.out.println("INVALID TIME");
	}

	int gethour() {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE HOUR TIME : ");
		int j = hours;
		j = s.nextInt();
		return (j);
	}

	int getminute() {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE MINUTE TIME : ");
		int w = minutes;
		w = s.nextInt();
		return (w);
	}

	int getsecond() {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE SECOND TIME : ");
		int k = seconds;
		k = s.nextInt();
		return (k);
	}

	void nextsecond() {
		seconds = seconds + 1;

		if (seconds > 59) {
			seconds = 0;
			minutes = minutes + 1;

			if (minutes > 59) {
				minutes = 0;
				hours = hours + 1;

				if (hours > 23) {
					hours = 0;
				}
			}
		}
	}

	void nextminute() {
		minutes = minutes + 1;
		if (minutes > 59) {
			minutes = 0;
			hours = hours + 1;
			if (hours > 23) {
				hours = 0;
			}
		}
	}

	void nexthour() {
		hours = hours + 1;
		if (hours > 23) {
			hours = 0;
		}
	}

	void previoussecond() {
		seconds = seconds - 1;

		if (seconds < 0) {
			seconds = 59;
			minutes = minutes - 1;

			if (minutes < 0) {
				minutes = 59;
				hours = hours - 1;

				if (hours < 0) {
					hours = 23;
				}
			}
		}
	}

	void previousminute() {
		minutes = minutes - 1;
		if (minutes <= 0) {
			minutes = 59;
			hours = hours - 1;

			if (hours <= 0) {
				hours = 0;
			}
		}
	}

	void previoushour() {
		hours = hours - 1;
		if (hours <= 0) {
			hours = 23;
		}
	}

	void display() {
		System.out.println("THE TIME IS :" + " " + hours + ":" + minutes + ":" + seconds);
	}
}

public class timestartsnow {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		time time = new time();
		time.settime(2, 24, 34);
		time.display();
		while (true) {
			System.out.println("SELECT ONE OF THE FOLLOWING");
			System.out.println("1.CHANGE TIME");
			System.out.println("2.INCREMENT THE TIME");
			System.out.println("3.DECREMENT THE TIME");
			int d = s.nextInt();
			switch (d) {
			case 1:
				int i, j, k;
				i = time.gethour();
				j = time.getminute();
				k = time.getsecond();
				time.settime(i, j, k); 
				time.display();
				break;
			case 2:
				int l;
				System.out.println("WHAT YOU WANT TO INCREMENT?");
				System.out.println("1.HOURS");
				System.out.println("2.MINUTES");
				System.out.println("3.SECONDS");
				l = s.nextInt();
				switch (l) {
				case 1:
					time.nexthour();
					time.display();
					break;
				case 2:
					time.nextminute();
					time.display();
					break;
				case 3:
					time.nextsecond();
					time.display();
					break;
				}
				break;
			case 3:
				int r;
				System.out.println("WHAT YOU WANT TO DECREMENT?");
				System.out.println("1.HOURS");
				System.out.println("2.MINUTES");
				System.out.println("3.SECONDS");
				r = s.nextInt();
				switch (r) {
				case 1:
					time.previoushour();
					time.display();
					break;
				case 2:
					time.previousminute();
					time.display();
					break;
				case 3:
					time.previoussecond();
					time.display();
					break;
				}
			}
		}

	}

}
