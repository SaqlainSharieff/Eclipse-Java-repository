
public class Method3 {

	public static void main(String[] args) {
		int result=add();
		System.out.println(result);
		System.out.println("method not accepting parameter list but returing value");

	}
         public static int add() {
        	 int a=10,b=20,c=30;
        	 int sum=a+b+c;
        	 return sum;
         }
}
