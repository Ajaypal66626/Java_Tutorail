package Test;

public class Leap_Year1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2012;
	    
	       if((year%400==0) || (year%4==0 && year%100!=0))
	       {
	           System.out.println("Leap Year");
	       }
	       else
	       {
	           System.out.println("Not a Leap year");
	       }
	}

}
