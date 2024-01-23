package Test;

public class switch_statement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String  browser="chrome";
		
		switch(browser)
		{
		case "Safari":
			System.out.println("The Browser is a Safari");
			break;
			
		case "edge":
			System.out.println("The Browser is a Edge");
			break;
			
		case "chrome":
			System.out.println("The Browser is a Chrome");
			break;
			
			default:
				System.out.println("Browser Not Supported");
		
		}
		
	}

}
