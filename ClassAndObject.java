package JavaOOPS;

class Test
{
	// Class is just a logical entity it wont have any physical existence
	
	Test()
	{
		super();  
		//default constructor called when object is created even when user has not written it explicitly 
	}
	
	int a =10;
	void printclassname() 
	{
		System.out.println("Class Name is Test");
	}
	
	
}


public class ClassAndObject {

	public static void main(String[] args) {
		
		Test Obj = new Test();
		Obj.printclassname();
		System.out.println("Value of a is:"+Obj.a);

		// Object is physical and logical both
		//when object is created memory gets allocated to it by JVM
		// When object is created with new Keyword default constructor is called
		//which initializes the object and allocates memory all fields are set to default values
		//int will be set to 0 and boolean will be set to false like that
		
	}

}
