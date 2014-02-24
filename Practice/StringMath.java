import java.util.Scanner;


public class StringMath {
	public static void main(String s[]) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("enter string");
		String input = kbd.next();
		for(int i = 0;i<input.length();i++) {
			if(input.charAt(i) == '*') {
				String output = input.substring(0, i-1);
				int a = Integer.parseInt(input.substring(i-1, i)) * Integer.parseInt(input.substring(i+1, i+2));
				output += "" + a;
				output += input.substring(0, i);
			}
		}
	}
}
