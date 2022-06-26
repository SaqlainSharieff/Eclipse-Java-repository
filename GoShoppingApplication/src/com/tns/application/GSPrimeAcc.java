package com.tns.application;

import com.tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc 
{

	private static final float charges=0; 
	
	
	public GSPrimeAcc() 
	{
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}
	
	public void bookProduct(float charges)
	{
		System.out.println("Dear prime User,Your product Charges are:"+charges);
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [isPrime=" + isPrime() + ", accNo=" + accNo + ", charges=" + charges + ", toString()="
				+ super.toString() + ", getAccNm()=" + getAccNm() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	

}
