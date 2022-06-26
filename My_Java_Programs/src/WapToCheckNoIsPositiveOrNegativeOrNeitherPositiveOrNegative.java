import java.util.Scanner;

public class WapToCheckNoIsPositiveOrNegativeOrNeitherPositiveOrNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		positive(num);

	}

	public static void positive(int num) {
		if (num > 0) {
			System.out.println("Entered number s positive " + num);

		} else if (num < 0) {
			System.out.println("Entred number is negative " + num);

		} else {
			System.out.println("Entred number is neither positive nor negative " + num);
		}

	}
}
