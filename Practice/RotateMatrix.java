import java.io.IOException;
import java.util.Scanner;
public class RotateMatrix {
	public static void main(String s[])throws IOException {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter size of matrix");
		int n = kbd.nextInt();
		int a[] = new int[n*n];
		int k = 0;
		for(int i=0; i<n; i++)
			for(int j=0;j<n;j++)	{
				System.out.println("Enter value at " + (i+1) + ", " + (j+1));
				a[k] = kbd.nextInt();
				k++;
			}
		int b[][] = new int[n][n];
		k=0;
		for(int i=n-1;i>=0;i--)
			for(int j=0;j<n;j++) {
				b[j][i] = a[k];
				k++;
			}
		for(int i=0; i<n; i++) {
			for(int j=0;j<n;j++)	
				System.out.print(b[i][j] + "  ");
				System.out.println("");
			}
	}
}
