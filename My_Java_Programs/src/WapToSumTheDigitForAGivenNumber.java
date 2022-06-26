
public class WapToSumTheDigitForAGivenNumber {

	public static void main(String[] args) {
	int num=321,rem=0,sum=0;
	while(num>0)
	{
		
		rem=num%10;
		System.out.println(rem);
	
		num=num/10;
		sum=sum+rem;
		
		
		
	}
	System.out.println("the sum of the extracted digit are  "+sum);
		
		

	}

}
