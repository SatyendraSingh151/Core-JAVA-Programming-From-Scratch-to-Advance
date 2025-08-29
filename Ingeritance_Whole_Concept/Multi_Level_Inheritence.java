package Ingeritance_Whole_Concept;
class Grandparent{
	void prop1() {
		System.out.println("This is the grandparent property.");
	}
}
class Father extends Grandparent{
	void prop2() {
		System.out.println("This is the parent property.");
	}
}
class Child2 extends Father{
	void prop3() {
		System.out.println("This is the child property.");
	}
	
}

public class Multi_Level_Inheritence  extends Child2{

	public static void main(String[] args) {
		
		Multi_Level_Inheritence n = new Multi_Level_Inheritence();
		n.prop1();
		n.prop2();
		n.prop3();

	}

}
