
public class ArrayMarksForAverageUsingForEachLoop {

	public static void main(String[] args) {
		float[] marks = { 86.5f, 86.1f, 45.9f, 62.8f, 95.9f };
		float sum = 0;
		for (float element : marks) {
			sum = sum + element;

		}
		System.out.println("The value of average marks is " + sum / marks.length);

	}

}
