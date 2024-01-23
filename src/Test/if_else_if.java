package Test;

public class if_else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Nested If
		int age=20;
		String gender="Male";
		
		if (age>18)
		{
			//Person is adult
		
			if(gender=="Male")
			{
				System.out.println("Your are adult and Male so you can shop on third floor");
			}
			else
			{
				System.out.println("Yor are adult but Gender is female so you can shop on Second floor");
			}
	}
			else  
		{
			System.out.println("You are a kid, So you can shop on the First floor");
		}
			
		}

	}