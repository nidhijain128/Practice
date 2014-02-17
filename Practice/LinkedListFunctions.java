

public class LinkedListFunctions {
	static Node n1;
	static Node n2;
	static Node n3;
	static Node n4;
	
	public static void main(String s[]) {
		n1 = new Node(1);
		n1.appendToTail(5);
		n1.appendToTail(2);
		n1.appendToTail(3);
		n1.appendToTail(4);
		System.out.println(n1.data);
		System.out.println(n1.next.data);
		System.out.println(n1.next.next.data);
	}
	
	public static Node deleteNode(Node head,int d) {
		Node n  = head;
		if(n.data == d)
			return head.next;
		while(n.next!=null) {
			if(n.next.data == d) {
				n.next = n.next.next;
				return head;
			}
			n = n.next;
		}
		return head;
	}
	
	
}

class Node {
	Node next = null;
	int data = -1;
	
	public Node(int d) {
		data = d;
	}
	
	public void appendToTail(int d) {
		if(this.data == -1)
		{
			System.out.println("if");
			this.data = d;
			this.next = null;
		}
		else {
			System.out.println(this.data);
			System.out.println("else");
		Node end = new Node(d);
		Node n = this;
		while(n.next!=null) {
			n = n.next;
		}
		n.next = end;
		}
	}
	
	
}
