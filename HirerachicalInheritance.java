package JavaOOPS;

class Parent2
{
	int a=10;
	void displayParent()
	{
		System.out.println("Parent Method");
	}
}


class Child11 extends Parent2
{
	void displayChild11()
	{
		System.out.println("Child11 Method");
	}
}

class Child22 extends Parent2
{
	void displayChild22()
	{
		System.out.println("Child22 Method");
	}
}


class Child33 extends Parent2
{
	void displayChild33()
	{
		System.out.println("Child33 Method");
	}
}


public class HirerachicalInheritance {

	public static void main(String[] args) {
		
		
		Child11 Obj =new Child11();
		Obj.displayChild11();
		Obj.displayParent();
		
		
		Child22 Obj1 =new Child22();
		Obj1.displayChild22();
		Obj1.displayParent();
		
		Child33 Obj2 =new Child33();
		Obj2.displayChild33();
		Obj2.displayParent();
	}

}
