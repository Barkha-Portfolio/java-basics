package JavaKeywords;

class static1
{
	//Static variables can be accessed directly with class name, no need to create an object
	static int age;
	static String Name= "Barkha";
	
	// non-static variable can be accessed only via object of static1 class
	String profession;; 
	

	//defined constructor with to initialize values
	static1(int x, String xyz)  //called when creating object with parameter list matching
	{
		age=x;
		profession=xyz;
		
	}
	
	//this method can be called without reference of an object
	static void display()
	{
		System.out.println("Static method");
		
	}
	
	//non-static method which accesses static and non-static variables and prints them
	void display1()
	{
		System.out.println(age+" "+ Name+" "+ profession+" ");
	}
	
	//When method is declared as static all members must be static
	static void membersprint()
	{
		age=35;
//		System.out.println(age+" "+Name+""+profession);
//		As profession is non-static hence line 38 will give compile time error
		System.out.println(age+" "+Name);
	}
	
	// Static block should be written at class level not at method or constructor level
	//if any class contains static block then before executing other things static blocks are executed
	// if there are multiple static blocks inside the class then they are executed in order how they are written
	static
	{
		System.out.println("If Any class contains static block then it will be executed even before other variables and methods are accessed");
	}
	
	static 
	{
		System.out.println("Second static Block");
	}
}




public class StaticKeyword {

	// Static block should be written at class level not at method or constructor level
	// if main and static block in same class then static block executes first
	static 
	{
		System.out.println("Main Method static block");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Start of Main method");
		
		
		
		// static variables and methods can be accessed without creating object and using class name directly
		System.out.println(static1.age);  //when static is not initialized it will print default value
		static1.display();
		static1.membersprint();
		
		
		static1 obj= new static1(10, "QA");
		System.out.println(obj.profession);
		
		obj.display1();
		
	}

}
