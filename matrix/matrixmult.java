package matrix;
import java.util.Scanner;

public class matrixmult {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int i, j, m, n;
		System.out.println("enter the number of rows for mat 1:");
		m = s.nextInt();
		System.out.println("enter the number of columns for mat 1:");
		n = s.nextInt();
		int a[][] = new int[m][n];
		System.out.println("Enter the elements for mat1:");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				a[i][j] = s.nextInt();
			}
		}

		int c, d, p, q;
		System.out.println("enter the number of rows for mat2:");
		p = s.nextInt();
		System.out.println("enter the number of columns for mat 2:");
		q = s.nextInt();
		int b[][] = new int[p][q];
		System.out.println("Enter the elements for mat2:");
		for (c = 0; c < p; c++) {
			for (d = 0; d < q; d++) {
				b[c][d] = s.nextInt();
			}
		}

		if (n == p) {
			 int[][] product = new int[m][q];
		        for(int u = 0; u < m; u++) {
		            for (int v = 0; v < q; v++) {
		                for (int k = 0; k < m; k++) {
		                    product[u][v] += a[u][k] * b[k][v];
		                }
		            }
		        }
		        System.out.println("result:");
				for(i=0;i<m;i++)
				{
					for(j=0;j<q;j++)
					{
						System.out.print(product[i][j] +" ");
					}
					System.out.println();
				}
				
				int z=0;
				for(i = 0; i<m ; i++)
			  	{
			   		z += product[i][i];
			  	}
			 
				System.out.println("The Sum of Diagonal Elements of a Matrix = "+ z );

		} else {
			System.out.println("matrix multiplication is not possible");
		}
		
	}
}
