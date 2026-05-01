package JavaIntro;

public class ExecutionSequence {

	public static void main(String[] args) {
		
		
		System.out.println("JVM Loads the class first");
		System.out.println("Then static variables are intialzed");
		System.out.println("Static blocks are executed");
		System.out.println("Static things are loaded at the time of class loading and loaded only once");
		
		System.out.println("Post that Object is created and heap memory is allocated");
		System.out.println("Instance variables gets Default values");
		System.out.println("Instance variables gets initialzed when values are written");
		System.out.println("and then construtor runs to set values");
		

	}

}
