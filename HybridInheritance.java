package JavaOOPS;

class grandparentclass
{
	void displayGrandparent()
	{
		System.out.println("GrandParent Method");
	}
}

class Parentclass extends grandparentclass
{
	void displayparent()
	{
		System.out.println("Parent Method");
	}
}

class child1 extends Parentclass
{
	void displayChild1()
	{
		System.out.println("Child1 Method");
	}
}


class child2 extends Parentclass
{
	void displayChild2()
	{
		System.out.println("Child2 Method");
	}
}

public class HybridInheritance {

	public static void main(String[] args) {
		
		grandparentclass obj = new grandparentclass();
		obj.displayGrandparent();
		
		Parentclass obj1 = new Parentclass();
		obj1.displayparent();
		obj1.displayGrandparent();
		
		
		child1 obj2 = new child1();
		obj2.displayChild1();
		obj2.displayparent();
		obj2.displayGrandparent();
		
		
		child2 obj3 = new child2();
		obj3.displayChild2();
		obj3.displayparent();
		obj3.displayGrandparent();
		
		

	}

}
