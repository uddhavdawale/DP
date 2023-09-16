package com.ud.factory;

public class BeanFactory 
{
	Windows win;
	
	public static OS getInstance(String oname) 
	{
		// TODO Auto-generated method stub
		if(oname.equals("windows"))
		{
			
			
			return new Windows("Windows 10","4GB","I7","1 TB","500 GB");
		}
		else if(oname.equals("mac"))
		{
			return new Mac();
		}
		return null;
		
	}

}
