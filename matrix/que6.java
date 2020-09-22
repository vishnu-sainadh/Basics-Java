package matrix;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

public class que6 {
    private static PrintStream ps;
    private static int i = 1;
    private static int j = 1;

    static {
        try {
            ps = new PrintStream(new File("C:\\Users\\vishnu\\Downloads\\output6.dat"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader(new File("C:\\Users\\vishnu\\Downloads\\in6.dat"));
        Scanner scan = new Scanner(fr);

        if (!scan.hasNextLine()) {
            System.out.println("Invalid input file.");
        }

        int arrays = (Integer.parseInt(scan.nextLine()));

        for (int k = 0; k < arrays; k++) {

            int[][] matrix = new int[Integer.parseInt(scan.nextLine())][Integer.parseInt(scan.nextLine())];

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (scan.hasNextLine()){
                        matrix[i][j] = Integer.parseInt(scan.nextLine());
                        System.out.println(matrix[i][j]);
                    }
                }
            }

            ps.println("Entered matrix (" + matrix.length + "," + matrix[0].length + ") is");
            printMatrix(matrix);

            int shortRoute = 0;

            for (int i = 0; i <= (matrix.length * matrix[0].length); i++) {
                shortRoute += evaluateMatrix(i, matrix);
            }

            ps.println("Number of steps to complete the path was " + shortRoute);
            i = 1; j = 1;
        }
    }

    private static int evaluateMatrix(int count, int[][] matrix) {

        int x = 0, y = 0;

        for (int a = 0; a < matrix.length; a++) {
            for (int b = 0; b < matrix[0].length; b++) {
                if (count + 1 == matrix[a][b]) {
                    a += 1;
                    b += 1;
                    x = Math.abs((a - i));
                    y = Math.abs((b - j));
                    i = a;
                    j = b;
                    break;
                }
            }
        }
        System.out.println("c" + (count) + " ==> (" + (i) + "," + (j) + ") ==> " + (x + y));
        return (x + y);
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                ps.print(matrix[i][j] + " ");
            }
            ps.println();
        }
    }
}