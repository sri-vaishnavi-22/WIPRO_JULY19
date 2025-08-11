package july30;
import java.util.Set;
import java.util.LinkedHashSet;

public class linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> s1 = new LinkedHashSet<String>();
		
		//no duplicate element
		//insertion order
		//multiple null values are allowed but gives only once as result
		//not snychronized 
		//slightly slower than hashset(order main)
		
		s1.add("orange");
		s1.add("blue");
		s1.add(null);
		s1.add("white");
		s1.add("red");
		s1.add(null);
		s1.add(null);
		
		System.out.println(s1);
		
		System.out.println(s1.contains("blue"));
		System.out.println(s1.remove("red"));
		System.out.println(s1);
		System.out.println(s1.size());
		System.out.println(s1.isEmpty());
		//System.out.println(s1.equals("white"));
		System.out.println(s1.hashCode());
		
		
		
		
		

	}

}