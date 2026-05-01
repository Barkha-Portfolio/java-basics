package JavaOOPS;

class Test11
{
	//Same class and same method name but signature is different
	void sum(int a, int b)
	{
		System.out.println("Sum is "+(a+b));
	}
	
	void sum(int a, int b,int c)
	{
		System.out.println("Sum is "+(a+b+c));
	}
	
	void sum(int a, float b)
	{
		System.out.println("Sum is "+(a+b));
	}
}



public class MethodOverloading {

	public static void main(String[] args) {
		
		Test11 obj=new Test11();
		obj.sum(10, 45);
		obj.sum(14, 16, 22);
		obj.sum(12, 50.6f);

	}

}
