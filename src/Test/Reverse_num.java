package Test;

public class Reverse_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=4578;
        int rem=0;
        int rev=0;
		
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
            num=num/10;
		}
		System.out.println(rev);
	}

}
