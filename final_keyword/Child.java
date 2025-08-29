package final_keyword;

class GrandParent{
	void land() {
		System.out.println("Purchased land");
	}
}

final class Parent extends GrandParent{
	
	void home() {
		System.out.println("Yes the home is there.");
	}
}

public class Child /* extends Parent this will 
give the CTE, final class cannot be inherited*/{

	public static void main(String[] args) {

//we can access directly by parent obj ref creation
		Parent p = new Parent();
		p.home();

		p.land();
	}

}
