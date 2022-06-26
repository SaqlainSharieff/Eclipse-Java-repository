
public class Method5 {

	public static void main(String[] args) {
		int result = add(10, 20, 30);
		System.out.println(result);
		System.out.println("Method accepting parameter list and returning value");

	}

	public static int add(int a, int b, int c) {
		int sum = a + b + c;
		return sum;
	}
}
