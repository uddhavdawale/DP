package com.ud.factory;

public class MainClass 
{
	public static void main(String[] args) 
	{

		System.out.println("illustartio of Bean Factory Methd...");
		OS windows=BeanFactory.getInstance("windows");
		OS windows1=BeanFactory.getInstance("windows");
		windows.spec();
		windows1.spec();
	}

}
