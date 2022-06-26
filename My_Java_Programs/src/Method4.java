
public class Method4 {

	public static void main(String[] args) {
		add(10, 20, 30);
		System.out.println("Method accepting parameter list but not returning any value");

	}

	public static void add(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println(sum);

	}
}
