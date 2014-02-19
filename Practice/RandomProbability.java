import java.util.Random;
import java.util.Scanner;


public class RandomProbability {
	static int counter[];
	static float prob[];
	public static void main(String s[]) {
		System.out.println("Enter size of arrays");
		Scanner kbd = new Scanner(System.in);
		int n = kbd.nextInt();
		counter = new int[n];
		prob = new float[n];
		System.out.println("Enter values of array 1");
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = kbd.nextInt();
		}
		System.out.println("Enter probabilty of values in array 1");
		float b[] = new float[n];
		for(int i=0;i<n;i++) {
			b[i] = kbd.nextFloat();
		}
		System.out.println("Press 1 to generate next number");
		int option = 0;
		do {
			option = kbd.nextInt();
			System.out.println(randomGen(a));
		}
		while(option==1);
	}

	private static int randomGen(int a[]) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int index = r.nextInt(a.length);
		int number = a[index];
		counter[index]++;
		int sum = 0;
		for(int i =0;i<a.length;i++)
			sum = sum + counter[i];
		for(int i=0;i<a.length;i++)
			prob[i] = (float) counter[i]/sum;
		return number;
	}
}
