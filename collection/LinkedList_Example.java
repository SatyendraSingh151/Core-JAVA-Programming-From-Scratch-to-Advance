package collection;
//importing the LinkedListfrom the util package
import java.util.LinkedList;

public class LinkedList_Example {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		
//		adding the data into the LinkedList
		
		l.add("Satya");
		l.add(151);
		l.add("Satya");
		l.add(0.97);
		l.add(0.97);
		l.add("Nancy");
		
//		printing the data directly
		System.out.println(l);
		
//		printing by for each loop
		
		for(Object o : l) {
			System.out.println(o);
		}
		
//		printing by for loop
		System.out.println("*****************");
		int size = l.size();
		for(int i=0; i<size; i++) {
			System.out.println(l.get(i));
		}
		
		System.out.println(l.size());
		l.remove(1);
		System.out.println(l);
	}

}
