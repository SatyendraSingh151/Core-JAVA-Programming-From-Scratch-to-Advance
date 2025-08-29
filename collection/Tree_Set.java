package collection;
import java.util.TreeSet;

public class Tree_Set {

	public static void main(String[] args) {
		
		TreeSet t =new TreeSet();
		t.add(151);
		t.add(25);
		t.add(-4);
		t.add(6);
		t.add(10);
//		t.add("Satya"); this will give ClassCastException
//		t.add(null);  this will give NullPointerException
		System.out.println(t);
		System.out.println("The size of the collection is : "+t.size());
		t.remove(6);
		System.out.println(t);
		t.clear();
		System.out.println(t);
		System.out.println(t.isEmpty());

	}

}
