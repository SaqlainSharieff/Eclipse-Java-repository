
public class WapToFindTheEntredNoIsPalindromeOrNot {

	public static void main(String[] args) {
		int num = 121, rem = 0, sum = 0, temp = num;
		while (num > 0) {
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;

		}
		if (sum == temp) {
			System.out.println("its an palindrome " + sum);
		} else {
			System.out.println("its not an palindrome " + sum);
		}
	}

}
