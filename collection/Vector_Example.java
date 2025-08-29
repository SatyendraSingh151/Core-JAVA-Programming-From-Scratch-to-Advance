package collection;
import java.util.Vector;

public class Vector_Example {

	public static void main(String[] args) {
//		creating the Vector  object
		
		Vector v = new Vector();
		
		v.add("Satya");
		v.add(151);
		v.add("Satya");
		v.add(0.97);
		v.add('N');
		System.out.println(v);
		System.out.println(v.size());
		v.add(1,"addedd data");
		System.out.println(v);
		
		System.out.println(v.size());
			
		System.out.println("*** Accessing by for each loop ****");
		
		for(Object o : v) {
			System.out.println(o);
		}
		
		System.out.println("*** Accessing by for  loop ****");

		int s = v.size();
		for(int i=0; i<s; i++) {
			System.out.println(v.get(i));
		}

		
	}

}
