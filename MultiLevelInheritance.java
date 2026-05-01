package JavaOOPS;

class GrandParent
{
	
	void display()
	{
		System.out.println("GrandParent Method");
	}
	
	int a=12;
	
}

class Parents extends GrandParent
{
	void display1()
	{
		System.out.println("Parent Method");
	}
	
	int b=123;
}

class childs extends Parents
{
	void display2()
	{
		System.out.println("Child Method");
	}
	
	int c=12345;
}



public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		
		GrandParent Obj = new GrandParent();
		Obj.display();
		System.out.println(Obj.a);
		
		
		
		Parents Obj1 = new Parents();		
		Obj1.display1();
		System.out.println(Obj1.b);
		
		
		Obj1.display();
		System.out.println(Obj1.a);
		
		
		
		
		
		childs Obj2 = new childs();	
		Obj2.display2();
		System.out.println(Obj2.c);
		
		Obj2.display1();
		System.out.println(Obj2.b);
		
		
		Obj2.display();
		System.out.println(Obj2.a);
		
		

	}

}
