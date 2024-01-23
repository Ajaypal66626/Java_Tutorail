package Test;

public class Leap_Year2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year=2010;
		
		if(year%4==0)
		{
			if(year%100==0)
			{
				
				if(year%400==0)
				{
					System.out.println("Leap Year");
				}
				else
				{
					System.out.println("Not a Leap Year");
				}
			}
			else
			{
				System.out.println("Leapp Year");
			}
		}
		else
		{
			System.out.println("Not ap Leap Year");
		}
	}

}
