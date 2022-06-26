package com.BasicDataStructure.Assignments;

public class Aramstrongnumber2 
{
	public static void main(String[] args) 
	{
		int num= 153,rem=0,sum=0,temp=sum;
		while(num>0) {
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println("its an amstrong number "+sum);
		}
		else {
			System.out.println("its not an amstrong number "+sum);
		}
	}

}
