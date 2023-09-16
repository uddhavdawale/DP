package com.ud;

/**
 * @author Raje
 *
 */
 public class Singleton 
{
	private  static Singleton s=new Singleton();
	int count=1;
	private Singleton()
	{
	System.out.println("Singleton object has been creatd..");	
	}
	
	static Singleton getInstance()
	{	
		System.out.println("retunring same instance");
		return s;
	}
}
