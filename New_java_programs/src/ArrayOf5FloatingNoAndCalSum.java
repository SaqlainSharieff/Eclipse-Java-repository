
public class ArrayOf5FloatingNoAndCalSum {

	public static void main(String[] args) {
		float[] marks = { 45.5f, 68.5f, 85.9f, 45.9f, 95.4f };
		float sum = 0;
		for (float element : marks) {
			sum = sum + element;

		}
		System.out.println("The total sum of 5 array is " + sum);
	}

}
