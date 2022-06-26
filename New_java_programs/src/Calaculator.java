import java.util.Scanner;

public class Calaculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your physics marks");
		int physics = sc.nextInt();

		System.out.println("Enter your English marks");
		int English = sc.nextInt();
		System.out.println("Enter your Chemistry marks");
		int Chemistry = sc.nextInt();
		System.out.println("Enter your Mathematics marks");
		int Mathematics = sc.nextInt();
		System.out.println("Enter your Computer science marks");
		int computer = sc.nextInt();
		float percentage = ((physics + English + Chemistry + Mathematics + computer) / 500.0f) * 100;
		System.out.print("percentage is " + percentage);
		
		
		
		
		

	}

}
