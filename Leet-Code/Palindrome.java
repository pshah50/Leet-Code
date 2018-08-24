import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the Integer number :");
		int x = src.nextInt();
		System.out.println("Original Value is : " + x);
		src.close();
		System.out.println("Number is Palindrome or not : " + isPalindrome(x));
	}

	public static boolean isPalindrome(int x) {
		int temp = 0;
		int originalValue = x;
		boolean palindromeVal;
		if (x < 0) {
			return false;
		}
		if (x < Integer.MAX_VALUE) {
			while (x != 0) {
				int mod = x % 10;
				temp = temp * 10 + mod;
				x /= 10;
			}
		}
		if (originalValue == temp) {
			palindromeVal = true;
		} else {
			palindromeVal = false;
		}
		return palindromeVal;
	}
}
