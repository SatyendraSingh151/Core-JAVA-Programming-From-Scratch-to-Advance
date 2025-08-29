package hybrid_inheritance;
//multilevel inheritance
class GrandFather{
	String prop1="Purchased Land";
}
 class Father extends GrandFather{
	 String prop2="Made a house";
	 
 }
 class Son extends Father{
	 String prop3="Baught own bike";
	 
 }
 
// hierarchical inheritance
 
 class GrandSon extends Son{
	 String prop4="Established own business";
	 
	 
 }
 class GrandDaughter extends Son{
	 String prop5="Opened Hospital";
	 
	 
 }
 
public class Test {

	public static void main(String[] args) {
		// hybrid inheritance ( combined multilevel and the hierarchical inheritance )
		
		GrandSon g = new GrandSon();
		System.out.println("Properties of Grand Son\n");
		System.out.println("Property 1 : "+g.prop1);
		System.out.println("Property 2 : "+g.prop2);
		System.out.println("Property 3 : "+g.prop3);
		System.out.println("Property 4 : "+g.prop4);
		
		System.out.println("\n ****************** \n ");
		
		System.out.println("Properties of Grand Daughter\n");
		GrandDaughter d = new GrandDaughter();
		System.out.println("Property 1 :"+d.prop1);
		System.out.println("Property 2 : "+d.prop2);
		System.out.println("Property 3 : "+d.prop3);
		System.out.println("Property 4 : "+d.prop5);

	}

}
