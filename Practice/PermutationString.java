import java.util.ArrayList;


public class PermutationString {
	public static void main(String s[]) {
		ArrayList<String> b = getP("cat");
		for(int i=0;i<b.size();i++)
		System.out.println(b.get(i));
	}
	public static ArrayList<String> getP(String str) {
		if(str == null)
			return null;
		ArrayList<String> permutations =  new ArrayList<String>();
		if(str.length() == 0) {
			permutations.add("");
			return permutations;
		}
		char first = str.charAt(0);
		System.out.println("first" + first);
		String rem = str.substring(1);
		System.out.println("rem" + rem);
		ArrayList<String> words = getP(rem);
		for(String word:words) {
			for(int j=0;j<=word.length();j++) {
				System.out.println("word" + word);
				String s = insertCharAt(word,first,j);
				System.out.println("s" + s);
				permutations.add(s);
			}
		}
		return permutations;
		
	}

	private static String insertCharAt(String word, char c, int i) {
		// TODO Auto-generated method stub
		String start = word.substring(0,i);
		String end = word.substring(i);
		return start+c +end;
	}
}
