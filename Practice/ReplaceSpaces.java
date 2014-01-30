/*
 * Write a method to replace all spaces in a string with "%20"
 */

import java.util.Scanner;

public class ReplaceSpaces {
	public static void main(String s[]) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter string");
		String a = new String();
		a = kbd.nextLine();
		System.out.println(a);
		int sc = 0;
		for(int i=0;i<a.length();i++)
			if(a.charAt(i) == ' ')
				sc++;
		int j=0;
		char b[] = new char[a.length() + sc*2];
		System.out.println(b.length);
		for(int i=0;i<b.length;i++) {
			if(a.charAt(j) == ' ')	{
				if(i <= b.length -2) {
					b[i] = '%'; b[i+1] = '2'; b[i+2] = '0';
					i = i+2;
					j++;
				}
			}
			else {
				b[i] = a.charAt(j);
				j++;
			}
		}
		String c = new String();
		for(int i =0;i<b.length;i++)
			c = c + b[i];
		System.out.println(c);
	}
}