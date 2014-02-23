import java.util.LinkedList;
import java.util.List;


public class ReverseAlternateLL {
	public static void main(String s[]) {
		List<Character>	input = new LinkedList<Character>();
		input.add('a');
		input.add('x');
		input.add('b');
		input.add('y');
		input.add('c');
		input.add('z');
		input.add('d');
		input.add('m');
		int pointer = input.size()-1;
		for(int i=pointer;i>=0;i-=2) {
			char a = input.remove(i);
			input.add(a);
			System.out.println(a);
		}
		System.out.println("list");
		for(int i =0;i<pointer+1;i++)
			System.out.println(input.get(i));
	}
}
