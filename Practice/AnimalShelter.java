import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AnimalShelter {
	static List<String> animals = new LinkedList<String>();
	public static void main(String s[]) {
		Scanner kbd = new Scanner(System.in);
		int choice = -1;
		String typeA = "";
		while(choice!=3) {
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Exit");
			choice = kbd.nextInt();
			if(choice == 1) {
				System.out.println("enter type of animal");
				typeA = kbd.next();
				System.out.println("y");
				enqueue(typeA);
			}
			else if(choice == 2) {
				System.out.println("1. Any");
				System.out.println("2. Dog");
				System.out.println("3. Cat");
				int option = kbd.nextInt();
				dequeue(option);
			}
		}
		for(int i=0;i<animals.size();i++)
			System.out.println(animals.get(i));
	}
	
	public static void enqueue(String type) {
		animals.add(type);	
	}
	
	public static void dequeue(int option) {
		if(option == 1)
			animals.remove(0);
		else if(option==2)
			for(int i=0;i<animals.size();i++) {
				if(animals.get(i) == "Dog")
					animals.remove(i);
				break;
			}
		else if(option==3)
			for(int i=0;i<animals.size();i++) {
				if(animals.get(i) == "Cat")
					animals.remove(i);
				break;
			}
	}
}
