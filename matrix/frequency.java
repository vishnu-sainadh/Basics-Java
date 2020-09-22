package matrix;
import java.util.*;

public class frequency {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = 0;
		System.out.println("enter no.of rows");
		int r = s.nextInt();
		System.out.println("enter no.of columns");
		int c = s.nextInt();
		int d[][] = new int[r][c];
		System.out.println("enter array");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				d[i][j] = s.nextInt();
			}
		}
		System.out.println("enter the number to know frequency of it");
		int ele = s.nextInt();
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (d[i][j] == ele) {
					count++;
				}
			}
		}
		System.out.println("Frequency of " + ele + " is " + count);
	}
}
