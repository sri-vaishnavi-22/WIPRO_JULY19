package july30;
import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		
					LinkedList<String> a1 = new LinkedList<String>();
					a1.add("Sri");
					a1.add("krishna");
					a1.add(null);
					a1.add("gopal");
					a1.add("jyothi");
					a1.add("shiva");
					System.out.println(a1);
					System.out.println(a1.get(2));
					System.out.println(a1.indexOf("krishna"));
					System.out.println(a1.isEmpty());
					System.out.println(a1.remove(2));
					System.out.println(a1);
					System.out.println(a1.set(4, "gopal"));
					System.out.println(a1);
					System.out.println(a1.size());
					System.out.println(a1);
				}

			}