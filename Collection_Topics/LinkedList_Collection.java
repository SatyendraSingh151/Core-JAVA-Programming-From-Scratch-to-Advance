package Collection_Topics;

// LinkedList class is present in the java.util package and this is also the child of the Queue
import java.util.LinkedList;

// LinkedList also shows the multiple inheritance


public class LinkedList_Collection {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
//		adding the elements in the LinkedList
		l.add(null);
		l.add(151);
		l.add("Satya");
		l.add(1.75f);
		l.add(true);
		l.add('a');
		
		
		System.out.println("The length of the LinkedList is = "+l.size());
		
		System.out.println("fetching the element at the specific index by passing the object into it = "+l.indexOf("Satya"));
		
		System.out.println(l.contains("Satya"));
		
		System.out.println(l.remove());
		
		System.out.println("Getting the size after removal of one element = "+l.size());
		
		l.removeAll(l);
		
		System.out.println("Again verifying the size after removal of all the elements = "+l.size());
		
		System.out.println("checking the LinkedList is empty or not : "+l.isEmpty());
		
		

	}

}
