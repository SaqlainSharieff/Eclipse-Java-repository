import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];

		System.out.println("Enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the key value");
		int key = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				System.out.println("Key found at index " + i + " the value is " + arr[i]);
			}
		}

	}

}
