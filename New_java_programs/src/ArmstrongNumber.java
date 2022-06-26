import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		System.out.println("enter the number to be checked");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int t1 = num;
		int len=0;
		// finding the length of the number
		while (t1 != 0) {
			t1 = t1 / 10;
			len = len + 1;
		}
		int t2 = num;
		// reverse a number wala concept
		//t2 = num;
		int arms = 0;
		while (t2 != 0) 
		{
			int rem = t2 % 10;
			int mul = 1;
			for (int i = 1; i <= len; i++)
			{
				mul = mul * rem;
			}
			 arms = arms + mul;
			t2 = t2 / 10;
		}
		
		if (arms == num) {
			System.out.println("this is an armstring number");
		} else {
			System.out.println("this is not armstrong number");
		}
	}
}