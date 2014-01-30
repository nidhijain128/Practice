/*
 * Implement a method to perform basic string compression using the counts of 
 * repeated characters.
 */
import java.util.Scanner;
public class StringCompression {
	public static void main(String s[]) {
		Scanner kbd = new Scanner(System.in);
		String a = new String();
		String b = new String();
		System.out.println("Enter input string");
		a = kbd.nextLine();
		for(int i=0;i<a.length();i++) {
			if(i==a.length()-1)
				b = b + a.charAt(i) + "1";
			else {
				int j = i+1;
				while(a.charAt(i) == a.charAt(j))
					j++;
				int z = j - i;
				b = b + a.charAt(i) + "" + z;
				i = j-1;
			}
		}
		if(a.length() <= b.length())
			System.out.println(a);
		else System.out.println(b);
	}
}
