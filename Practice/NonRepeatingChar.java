import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class NonRepeatingChar {
	public static void main(String s[]) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("enter string");
		String a = kbd.nextLine();
		List<Character> arr = new ArrayList<Character>();
		List<Character> dust = new ArrayList<Character>();
		System.out.println(a.length());
		for(int i=0;i<a.length();i++) {
			if(arr.contains(a.charAt(i))) {
				Character temp = a.charAt(i);
				arr.remove(temp);
				dust.add(temp);
			}
			else if(!dust.contains(a.charAt(i))){
				arr.add(a.charAt(i));
				System.out.println("else");
			}
		}
		
		for(Character i:arr) {
			System.out.println(i);break;}
		
	}
}
