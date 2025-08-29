package object_class_Part3;

public class Stu {
	String name;
	boolean house;
	double sal;
	
	Stu(String name, boolean house ,double sal){
		this.name=name;
		this.house=house;
		this.sal=sal;
	}

	@Override
	public boolean equals(Object o) { // this is used to compare the values of the object creation
		
//		doing the down casting
	
		Stu s =(Stu)o;
		
		return (this.name==s.name) && (this.house==s.house) && (this.sal==s.sal);
	
	}
	public static void main(String[] args) {
		
		Stu s1= new Stu("Satya",true,384500);
		Stu s2= new Stu("Satya",true,384500);
		
//		getting the hash code by toString()
		System.out.println(s1+" ,\n"+s2);
		
//		comparing the object reference variable
		System.out.println("\nComparing gives : "+s1.equals(s2));

	}

}
