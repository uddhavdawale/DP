package com.ud.factory;

public class Windows extends Specifications implements OS
{ 	static int count=0;
	String lid="windows1001";

	public Windows(String oname, String ram, String processor, String hdd, String sDD)
	{
		super(oname, ram, processor, hdd, sDD);
		this.lid=lid+(count+11);
		// TODO Auto-generated constructor stub
	}

	public String getLid() {
		return lid;
	}

	@Override
	public void spec() 
	{
		// TODO Auto-generated method stub
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Windows [lid=" + lid +","+super.toString()+ "]";
	}
}
