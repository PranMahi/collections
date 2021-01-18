import java.util.*;

public class Result {

	public static void main(String[] args) {
		
		List<String> l=new ArrayList<>();
		
		l.add("a");
		l.add("za");
		l.add("c");
		l.add("c");
		l.add(null);
		
		
		Iterator<String> i=l.iterator();
		
		while(i.hasNext())
		{
			
			System.out.println(i.next());
		}
		
	}

}
