package Collection_Topics;
// importing the Stack class
import java.util.Stack;


public class Stack_Example {

	public static void main(String[] args) {
		// making the object of the Stack class
		Stack s = new Stack();
		s.add(null);
		s.add(151);
		s.add("Satya");
		s.add(null);
		s.add("Satya");
		s.add(true);
		System.out.println("The Stack members are : "+ s);
		
//		getting the size of the Stack
		System.out.println("The size is : "+s.size());
		
//		getting the peek element -> last member
		System.out.println("The last element is : "+s.peek());
		
//		deletion of the last element
		s.pop();

		System.out.println("Again the Stack is : "+s +" and the size is : "+s.size());
		
//		removing all the elements of the Stack
		s.removeAll(s);
		System.out.println("Now checking the element are deleted or not : "+s.isEmpty());
		
//		again checking the elements are deleted or not
		System.out.println("Getting the size of the Stack : "+s.size());
	}

}
