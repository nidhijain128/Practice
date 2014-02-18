import java.util.Scanner;


public class QueueUsingStack {
	static Stack s1 = new Stack();
	static Stack s2 = new Stack();
	public static void main(String s[]) {
		Scanner kbd = new Scanner(System.in);
		int choice = -1;
		int a = -1;
		while(choice!=3) {
			System.out.println("1. Enquque");
			System.out.println("2. Dequeue");
			System.out.println("3. Exit");
			choice = kbd.nextInt();
			if(choice == 1) {
				a = kbd.nextInt();
				enqueue(a);
			}
			else if(choice==2)
				dequeue();
		}
		if(s1.top!=null)
			System.out.println(s1.peek());
		else if(s2.top!=null)
			System.out.println(s2.peek());
	}
	
	public static void enqueue(int a) {
		if(s2.top==null)
			s1.push(a);
		else {
			int b = s2.pop();
			while(b!=0) {
				s1.push(b);
				b = s2.pop();
			}
			s1.push(a);
		}
	}
	
	public static void dequeue()
	{
		while(s1.top!=null) {
			int a  =s1.pop();
			s2.push(a);
		}
		int b = s2.pop();
	}
}

class Stack {
	Node top;
	public void push(int item) {
		Node t = new Node(item);
		t.next= top; 
		top =t;
	}
	
	public int pop() {
		int a = 0;
		if(top!=null) {
			a = top.data;
			top = top.next;
			return a;
		}
		return a;
	}
	
	public int peek() {
		return top.data;
	}
}
