import java.util.Scanner;

public class EvenOrOddUsingMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		even(num);

	}

	public static void even(int num) {
		if (num % 2 == 0) {
			System.out.println("the number is even " + num);

		} else {
			System.out.println("the number is odd " + num);
		}

	}
}
