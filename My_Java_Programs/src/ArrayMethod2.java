import java.util.Scanner;

public class ArrayMethod2 {

	public static void main(String[] args) {
		int arr[] = store();
		int key1 = key();
		print(arr, key1);

	}

	public static int[] store() {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		// System.out.println("Enter the array size");
		// int size = sc.nextInt();
		// int arr[]= new int[size];
		System.out.println("Enter the array elements");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		return arr;
	}

	public static int key() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key value");
		int key1 = sc.nextInt();
		return key1;

	}

	public static void print(int[] arr, int key1) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (key1 == arr[i]) {
				count++;
				break;
			}
		}
		if (count == 1) {
			System.out.println("key is found");
		} else {
			System.out.println("The key is not found");
		}

	}

}
