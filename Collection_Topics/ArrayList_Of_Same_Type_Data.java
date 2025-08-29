package Collection_Topics;
import java.util.ArrayList;
import java.util.List;

//size of the ArrayList is dynamic we can add as much as we want

public class ArrayList_Of_Same_Type_Data {

	public static void main(String[] args) {

//		making the object of the ArrayList of the List interface
		List<Integer> l =  new ArrayList<>();
		
//		adding the elements in the list
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		l.add(9);
		l.add(10);
		
		System.out.println("The elements of the List are "+l);

//		getting the size of the ArrayList
		System.out.println("The size of the arraylist is = "+l.size());
		
//		we can fetch the ArrayList by the Object based
		System.out.println(l.indexOf(5));
		
		
		
	}

}
