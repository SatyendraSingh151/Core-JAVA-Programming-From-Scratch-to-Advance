package Collection_Topics;

// importing the collection interfaces classes based on hierarchy

/*
 * 										Iterable ( This is a interface denoted by <<I>> )
 * 
 * 
 * 
 * 										Collection ( This is a interface denoted by <<I>> )
 * 
 * 
 * 
 * 			List ( <<I>> )                  Queue ( <<I>> )					Set  ( <<I>> )
 * 
 * 
 * 1) ArrayList 			3)LinkedList	                           1) HashSet		2) TreeSet
 * 				2) Vector												 	
 * 																		LinkedHashSet				
 * 				Stack
 * 							 
 * 
 * 
 */

// importing the ArrayList class which is available in the util package
import java.util.ArrayList;
/* 
 * ArrayList -> This maintains the insertion order 
 * 				null is also allowed in this
 * 				can accept any type of data
 * 				it has all the properties of the Collection Interface
 * 				it is index based
 */

public class ArrayList_Collection_Class {

	public static void main(String[] args) {
		
		// making the object of the ArrayList class
		
		ArrayList a = new ArrayList();
		
		a.add(4);
		a.add(54);
		a.add(74);
		a.add("Satya");
		a.add(null);
		a.add(1.51);
		a.add(true);
		a.add('A');
		a.add("String is also possible to add");
		
		System.out.println(a); // this will print the collection
		System.out.println("Previous size is "+a.size()); // this returns the size of the  collection
		System.out.println(a.indexOf("Satya"));  // this returns the index of the passed object
		System.out.println(a.contains("Satya"));  // this check whether the passed object available or not, and gives the boolean data as return
		System.out.println(a.getFirst()); // this will get the first collection element
		System.out.println(a.add("This data is added after creation"));  //this will add the object in the collection and return boolean type 
		System.out.println("Updated size is "+a.size()); // this will give the size of the collection

	}

}
