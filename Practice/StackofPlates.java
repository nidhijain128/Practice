import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
public class StackofPlates {
	static int a;
	public static void  main(String s[]) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("enter max capacity if a stack");
		int capacity = kbd.nextInt();
		int count = 0;
		Set<Stack> set = new HashSet<Stack>();
		System.out.println("enter values");
		while(a!=-1) {
			a = kbd.nextInt();
			count++;
			if(set.size()==0) {
				Stack<Integer> b = new Stack<Integer>();
				b.push(a);
				set.add(b);
			}
			if(capacity == count) {
				Stack<Integer> b = new Stack<Integer>();
				b.push(a);
				set.add(b);
				count = 0;
			}
		}
		Iterator iterator = set.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}
}
