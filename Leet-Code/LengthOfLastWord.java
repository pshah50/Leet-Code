import java.util.Scanner;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the String :");
		String x = src.next();
		System.out.println("Length is : " + lengthOfLastWord(x));
	}

	public static int lengthOfLastWord(String s) {
		int length = 0;
		if (s.length() <1 || s == null) {
			return 0;
		}
		boolean flag =false;
		for (int i = s.length()-1; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				length++;
				flag =true;
			} 
			else {
				if(s.charAt(i) == ' ' && flag == true) 
				break;
			}

		}
		return length;
	}
}
