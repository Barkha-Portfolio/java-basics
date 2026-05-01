package JavaKeywords;

class Test
{
	//these are instance variables to the class 
	
	int age;
	String name;
	
	Test(int age, String name)
	{
		//these are local variables
		//but here when constructor is called after creating the object parameter value is getting assigned to parameter
		//But in display method we are not accessing local variables of constructor actually we are accessing instance variables
		//but those are initialized to default values as reassignment is not done
		age=age;
		name=name;
		
		//here it will print default values as 10 and null
		
		//hence this keyword is used to refer instance variables
		//this.age will indicate instance variable value is being taken from parameter
		
		this.age=age;
		this.name=name;
		
		//but after this actual values are assigned to instance variables
		
	}
	
	void display()
	{
		System.out.println(age+" "+ name);
	}
	
	
	
}



public class ThisKeyword {

	public static void main(String[] args) {
		
		Test obj=new Test(30, "Barkha");
		obj.display();
		
		Test obj1=new Test(43, "DM");
		obj1.display();


	}

}
