
public class WapToFindTheEntredNoIsArmstromNoOrNot {

	public static void main(String[] args) {
		int num=153,rem=0,sum=0,temp=num;
		while(num>0)
		{
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
             if(sum==temp)
             {
            	 System.out.println("its an armstrom number "+sum);
             }
             else
             {
            	 System.out.println("its not an armsrom number "+sum);
             }
	}

}
