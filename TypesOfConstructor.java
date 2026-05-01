package JavaIntro;


class constructortypes
{
	constructortypes()
	{
		System.out.println("Default constructor being called when object is created");
	}
	
	constructortypes(int a, int b)
	{
		int sum = a+b;
		System.out.println("SUM calculated when object with parameters are created which matches the signature of particular parameterized constrtor:"+ sum);
	}
	
	constructortypes(String abc)
	{
		System.out.println(abc);		
	}
	
	constructortypes(int x, int y, boolean z)
	{
		System.out.println("First number:"+x + "Second Number:"+ y + "Boolean Value:"+z);
	}
	
}

public class TypesOfConstructor {

	public static void main(String[] args) {
		
		//Default and Parameterized
		
		
		//Default
		constructortypes Obj = new constructortypes();
		
		//Parameterized
		
		constructortypes Obj1 = new constructortypes(10, 22);
		
		constructortypes Obj2 = new constructortypes("Constructor with One parameter as string");
		
		constructortypes Obj3 = new constructortypes(10, 22, true);

	}

}
