package Collection_Topics;

// importing the Vector class of the List Interface which is available in the util package
import java.util.Vector;

public class Vector_Class {

	public static void main(String[] args) {
		// making the object of the Vector class

		Vector v =  new Vector();
		
		v.add(151);
		v.add("Satya Yadav");
		v.add(null);
		v.add(1.51);
		v.add(45.45f);
		v.add(false);
		v.add('s');
		
//		getting the elements of the collection
		
		System.out.println("The Vector elements are : "+v);
		System.out.println("This is the previous size of the collection : "+v.size());
		System.out.println(v.capacity());
		System.out.println(v.contains("Satya Yadav"));
		System.out.println(v.firstElement());
		System.out.println(v.getLast());
		System.out.println(v.getFirst());
		System.out.println(v.get(5));
		System.out.println(v.lastIndexOf('S'));
		
		System.out.println(v.remove(0));
		
		System.out.println("New size of the collection "+v);
		System.out.println(v.removeAll(v));
		
		System.out.println(v.isEmpty());
		System.out.println("Finally size of the collection "+ v.size());
		
		
		System.out.println(v.add("This is the new data"));
		
	
	}

}
