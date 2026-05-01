package JavaOOPS;

public class MainMethodOverloading {
	
	
	int main(int a, int b)
	{
		System.out.println("Main Method used for overloading");
		return a+b;
	}

	public static void main(String[] args) {
		
		System.out.println("Even if the main method is overloaded program execution will start from here because this main method has arguments as array of string and java executes program from this");
		
		//if want to call above main menthod then it can be called as normal java methods are called by creation of object
		MainMethodOverloading obj= new MainMethodOverloading();
		obj.main(10,20);
	}

}
