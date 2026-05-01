package JavaOOPS;

interface Test1
{
	//by default all methods in interface will be abstract
	void displayInterface1();
}

interface Test2
{
	//by default all methods in interface will be abstract
	void displayInterface2();
}

class MultilevelInheritance implements Test1,Test2
{

	//if class is implementing multiple interfaces it must implement all the methods of implemented interfaces
	public void displayInterface2() 
	{
		System.out.println("Interface 2");		
	}

	public void displayInterface1() 
	{
		System.out.println("Interface 1");		
	}
	
}

public class MultipleInheritanceUsingInterface {

	public static void main(String[] args) {
		
		// Object of interface can not be directly created as it does not have any kind of implementation.
		//It only contains abstract methods - Method without implementation hence object creation is not possible
		
		//reference can be created in following way
		
		Test1 ref1 = new MultilevelInheritance();  // object of MultilevelInheritance is created with reference to Test1 interface
		ref1.displayInterface1();
		
		
		
		Test2 ref2 = new MultilevelInheritance();  // object of MultilevelInheritance is created with reference to Test2 interface
		ref2.displayInterface2();
		
		MultilevelInheritance Obj = new MultilevelInheritance();
		Obj.displayInterface1();
		Obj.displayInterface2();
	}

}
