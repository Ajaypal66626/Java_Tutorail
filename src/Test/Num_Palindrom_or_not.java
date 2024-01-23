package Test;

public class Num_Palindrom_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int no=121;
		   int temp=no;
		   int rev=0;
		   int rem;
		   
		   while(temp!=0)
		   {
		    rem=temp%10;
		    rev=rev*10+rem;
		    temp=temp/10;
		    }
		    if(no==rev)
		    {
		        System.out.println("No is palindrom");
		    }
		    else
		    {
		        System.out.println("No is not Palindrom");
		    }

	}

}
