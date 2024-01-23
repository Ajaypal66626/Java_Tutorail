package Test;

public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int num=8;
  int temp=0;
  for(int i=2;i<=num-1;i++)
  {
	  if(num%i==0)
	  {
		  temp=temp+1;
	  }
  }	  
		  if(temp>0)
		  {
			  System.out.println("Number " +num+  " : is not Prime Number ");
		  }
		  else
		  {
			  System.out.println("Number " + num +  " : is Prime Number");
		  }
	  
  }
	}


