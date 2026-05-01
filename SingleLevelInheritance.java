package JavaOOPS;


class Parent
{
	int a= 10;
	
	int sum(int x, int y)
	{
		return x+y;
	}
}


class child extends Parent
{
	int b = 10;
	
	String Display(String abc)
	{
		return abc;
	}
}



public class SingleLevelInheritance {

	public static void main(String[] args) {
		

		child obj = new child();
		
		System.out.println(obj.Display("Method with string return type"));
		System.out.println(obj.b);
		
		
		//Parent class members accessed using child class object
		
		System.out.println(obj.sum(234,456));
		System.out.println(obj.a);
		
		
	}

}
