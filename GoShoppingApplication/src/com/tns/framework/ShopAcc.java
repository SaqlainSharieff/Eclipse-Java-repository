package com.tns.framework;

public  class ShopAcc 
{

	protected static int accNo;
	protected  String accNm;
	private float charges;
	
	public static int getAccNo() {
		return accNo;
	}
	public static void setAccNo(int accNo) {
		ShopAcc.accNo = accNo;
	}
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	
	public ShopAcc(int accNo, String accNm, float charges) 
	{
		super();
		this.accNo = accNo;
		this.setAccNm(accNm);
		this.charges = charges;
	}
	public void bookProduct(float charges)
	{
		System.out.println("Product boocked and charges are:"+charges);
	}
	public void items(float charges)
	{
		System.out.println("Items are delivered with charges :"+charges);
	}
	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + getAccNm() + ", charges=" + charges + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
