package JavaKeywords;


class SuperParent
{
	SuperParent()
	{
		System.out.println("Parent class Default constructor");
	}
	int age= 30;
	String name= "JOHN";
	
	void show()
	{
		System.out.println(age);
		System.out.println(name);
	}
}


public class SuperKeyword extends SuperParent {

	
	SuperKeyword()
	{
		super();
		System.out.println("Main Default constructor");
	}
	
	void show()
	{
		super.show();
		System.out.println(super.age);
		System.out.println(super.name);
	}
	public static void main(String[] args) {


		int age=5;
		String name="Michel";
		
		SuperParent obj= new SuperParent();
		SuperKeyword obj1= new SuperKeyword();
		obj1.show();
		
		System.out.println(age);
		System.out.println(name);
		
	}

}
