package collection;
// importing the ArrayList

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList a =new ArrayList();
		System.out.println(a.add("Satya"));
		System.out.println(a.add(151));
		System.out.println(a.add(null));
		System.out.println(a.add(151));
		System.out.println(a.add("*"));
		System.out.println(a.add('$'));
		
		System.out.println(a);
		
		a.add(2, "New Data");
		System.out.println(a);
		
		System.out.println(a.size());
		a.remove(6);
		System.out.println(a);
		System.out.println(a.size());

	}

}
