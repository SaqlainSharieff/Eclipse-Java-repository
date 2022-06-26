import java.util.Scanner;

public class WapToCheckNoIsPositiveOrNegativeOrNeitherPositiveOrNegative2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1");
		double num1 = sc.nextDouble();
		System.out.println("Enter the number 2");
		int num2 = sc.nextInt();
		positive(num1, num2);

	}

	public static void positive(double num1, int num2) {
		if ((num1 > 0) || (num2 > 0)) {
			System.out.println("Entered number s positive " + num1);
			System.out.println("Entered number s positive " + num2);

		} else if ((num1 < 0) || (num2 < 0)) {
			System.out.println("Entred number is negative " + num1);
			System.out.println("Entred number is negative " + num2);

		} else {
			System.out.println("Entred number is neither positive nor negative " + num1);
			System.out.println("Entred number is neither positive nor negative " + num2);
		}

	}
}
