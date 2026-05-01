package JavaIntro;

class MethodCascadingTest
{
	void display()
	{
		System.out.println("Display Method");
		
	}
	
	int sum(int a, int b)
	{
		return a+b;
	}
	
	String printname(String name)
	{
		return name;
	}
	
	void cascadingmethod()
	{
		display();
		System.out.println(sum(20, 30));
		System.out.println(printname("Barkha"));
	}
	
}

public class MethodCascading {

	public static void main(String[] args) {
		
		
		MethodCascadingTest obj =new MethodCascadingTest();
		obj.cascadingmethod();
		

	}

}
