package JavaOOPS;

class Staticmethod
{
	static void display()
	{
		System.out.println("Display method without an argument");
	}
	
	static void display(int a)
	{
		System.out.println("Display method without int as an argument "+a);
	}
	
	static void display(String s)
	{
		System.out.println("Display method without int as an argument "+s);
	}
	
}

public class StaticMethodOverloading {

	public static void main(String[] args) 
	{
		//when static method is overloaded no need to create object explicitly 
		Staticmethod.display();
		Staticmethod.display(10);
		Staticmethod.display("Display_Method");

	}

}
