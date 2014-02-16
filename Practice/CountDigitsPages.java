import java.util.Scanner;


public class CountDigitsPages {
	public static void main(String s[]) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("enter number of digits");
		int n = kbd.nextInt();
		int input[][] = new int[2][n+1];
		for(int i=0;i<n+1;i++)
			input[0][i] = i;
		for(int i =0;i<n+1;i++) {
			int a = input[0][i];
			while(a!=0) {
				int b = a%10;
				input[1][b]++;
				a = a/10;
			}
		}
		for(int i=0;i<10;i++)
			System.out.println(input[0][i] + "-" +input[1][i]);
	}
}
