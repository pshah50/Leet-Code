import java.util.Scanner;

public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the String :");
		String x = src.next();
		System.out.println("Original Value is : " + x);
		src.close();
		System.out.println("Number is Palindrome or not : " + myAtoi(x));
	}

	public static int myAtoi(String str) {
		int value = 0;
		if(Integer.parseInt(str) > Integer.MAX_VALUE) {
			value  = Integer.MIN_VALUE;
		}
		int i=0, temp = 0;
		while(i < str.length()) {
			if(Character.isLetter(str.charAt(0))) {
				value = 0;
				break;
			}
			else if(Character.isDigit(str.charAt(i))) {
				temp = temp*10 + Integer.parseInt(str, str.charAt(i));
				i++;
			}
		}
		
		return value;
	}
}
