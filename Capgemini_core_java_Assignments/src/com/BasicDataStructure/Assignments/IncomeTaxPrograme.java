package com.BasicDataStructure.Assignments;

import java.util.Scanner;

public class IncomeTaxPrograme {
	public static void main(String[] args) {
		double tax=0;
		System.out.println("enter the amount");
		Scanner sc=new Scanner(System.in);
		double amount= sc.nextDouble();
		if(amount>=0 && amount<=180000) 
		{
			System.out.println("NO TAX");
		}
		else if(amount>=181001 && amount<=300000)
		{	
			tax = 0.1 * amount;
			System.out.println("u have to pay 10% of tax that is "+tax);
		}
		else if(amount>=300001 && amount<=500000)
		{
			tax = 0.2 * amount;
			System.out.println("u have to pay 20% of tax that is "+tax);
		}
		else if(amount>=500001 && amount<=1000000)
		{
			tax = 0.3 * amount;
			System.out.println("u have to pay 30% of tax that is "+tax);
		}
		else
		
		{
			tax = 0.5 * amount;
			System.out.println("u have to pay 50% of tax that is "+tax);
		}
		
		

	}

}


