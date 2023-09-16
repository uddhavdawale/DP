package com.ud.factory;

public class Mac implements OS
{ 	
	String lid;
	String oname,ram,processor,hdd,SDD;
	public Mac(){}

	public Mac(String lid,String oname, String ram, String processor, String hdd, String sDD) 
	{
		this.lid = lid;
		this.oname = oname;
		this.ram = ram;
		this.processor = processor;
		this.hdd = hdd;
		SDD = sDD;
	}
	
	public void getLaptopId() {
		this.lid = lid;
	}
	
	public String getOname() 
	{
		return oname;
	}

	public void setOname(String oname) 
	{
		this.oname = oname;
	}

	public String getRam() 
	{
		return ram;
	}

	public void setRam(String ram) 
	{
		this.ram = ram;
	}

	public String getProcessor() 
	{
		return processor;
	}

	public void setProcessor(String processor) 
	{
		this.processor = processor;
	}

	public String getHdd() 
	{
		return hdd;
	}

	public void setHdd(String hdd) 
	{
		this.hdd = hdd;
	}

	public String getSDD() 
	{
		return SDD;
	}

	public void setSDD(String sDD) 
	{
		SDD = sDD;
	}

	@Override
	public void spec() 
	{
		// TODO Auto-generated method stub
		toString();
	}

	@Override
	public String toString() {
		return "Windows [lid=" + lid + ", oname=" + oname + ", ram=" + ram + ", processor=" + processor + ", hdd=" + hdd
				+ ", SDD=" + SDD + "]";
	}
	

}
