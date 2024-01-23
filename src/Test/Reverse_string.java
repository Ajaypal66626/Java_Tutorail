package Test;

public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Ajay PAl SIngh Gour";
		int leng = name.length(); // length() method provide a length of the String
		String rev = "";

		for (int i = leng - 1; i >= 0; i--) {
			rev = rev + name.charAt(i); // charAt() method provide a index value of the Character
		}
		System.out.println(rev);
	}
}
