import java.util.Scanner;

public class ArrayMethod1 {

	public static void main(String[] args) {
		int arr[] = store();
		print(arr);

	}

	public static int[] store() {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array element");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		return arr;

	}

	public static void print(int[] arr) {
		System.out.println("The array elements are");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
	}

}
