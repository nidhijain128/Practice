import java.util.Scanner;


public class EmptyStringSort {
	public static void main(String s[]) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter lenght of array");
		int n = kbd.nextInt();
		String a[] = new String[n];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter string");
			a[i] = kbd.nextLine();
		}
		System.out.println("Enter the string to be searched");
		String z = kbd.nextLine();
		int num = sort(a,0,n-1,z);
		System.out.println(num);
	}
	
	public static int sort(String a[], int left, int right,String z) {
		int mid1 = (left+right)/2;
		int mid2 = mid1;
		while(a[mid1].equals(""))
			mid1--;
		while(a[mid2].equals(""))
			mid2++;
		while(a[left].equals(""))
			left++;
		while(a[right].equals(""))
			right--;
		if(a[mid1].equals(z))
			return mid1;
		else if(a[mid1].compareTo(z)>0)
			return sort(a,left,mid1-1,z);
		else if(a[mid2].equals(z))
			return mid2;
		else if(a[mid2].compareTo(z)<0)
			return sort(a,mid2+1,right,z);
		else return -1;
	}
}
