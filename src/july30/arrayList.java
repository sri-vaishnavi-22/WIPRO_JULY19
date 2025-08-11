package july30;
import java.util.ArrayList;
public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Sri");
		a1.add("Krishna");
		a1.add(null);
		a1.add("Gopal");
		a1.add("Jyothi");
		a1.add("shiva");
		System.out.println(a1);
		System.out.println(a1.get(2));
		System.out.println(a1.indexOf("Krishna"));
		System.out.println(a1.isEmpty());
		System.out.println(a1.remove(2));
		System.out.println(a1);
		System.out.println(a1.set(4, "shiva"));
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a1);
	}

}