import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter the array element");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("Enter the key value");
		int key = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == key) {

				count++;
				break;

			}
		}
		if (count == 1) {
			System.out.println("the key is found");

		} else {
			System.out.println("key is not found");
		}

	}

}
