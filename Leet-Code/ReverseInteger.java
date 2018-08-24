import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the Integer number :");
		int x = src.nextInt();
		System.out.println("Original Value is : " + x);
		src.close();
		System.out.println("Reverse Integer value is : " + reverse(x));
	}

	public static int reverse(int x) {
		int a = 0;
		boolean isNegative = false;
		if (x < 0) {
			isNegative = true;
			x = x * -1;
		}
		if (x <= Integer.MAX_VALUE) {
			while (x != 0) {
				int r = x % 10;

				if (a * 10L > Integer.MAX_VALUE || a * 10L < Integer.MIN_VALUE) {
					return 0;
				}
				a = a * 10 + r;
				x /= 10;

			}
			if (isNegative) {
				return a * -1;
			} else {
				return a;
			}
		} else
			return 0;
	}
}