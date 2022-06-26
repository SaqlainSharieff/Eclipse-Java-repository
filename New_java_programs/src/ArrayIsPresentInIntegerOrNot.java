
public class ArrayIsPresentInIntegerOrNot {

	public static void main(String[] args) {
		float[] marks = { 45.5f, 68.5f, 85.9f, 45.9f, 95.4f };
		float num = 45.5f;
		boolean isInArray = false;
		for (float element : marks) {
			if (num == element) {
				isInArray = true;
				break;

			}
		}
		if (isInArray) {
			System.out.println("The value is present in the array " + num);
		} else {
			System.out.println("The value is not present in the array " + num);
		}
	}

}
