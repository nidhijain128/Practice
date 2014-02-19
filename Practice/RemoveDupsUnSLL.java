import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class RemoveDupsUnSLL {
    public static void main(String s[]) {
        List<Character> a = new LinkedList<Character>();
        a.add('F');a.add('O');a.add('L');a.add('L');a.add('O');a.add('W');a.add(' ');a.add('U');a.add('P');
        Map<Character,Integer> b = new HashMap<Character,Integer>();
        for(int i=0;i<a.size();i++) {
            if(b.containsKey(a.get(i)))
            	b.put(a.get(i), b.get(a.get(i))+1);
            else b.put(a.get(i), 1);
        }
        System.out.println(b.keySet());
        System.out.println(b.values());
        for(int i=0;i<a.size();i++) {
        	if(b.get(a.get(i))>1) {
        		b.put(a.get(i), b.get(a.get(i))-1);
        		a.remove(i);
        	}
        }
        for(int i=0;i<a.size();i++)
        System.out.println(a.get(i));
    }
}