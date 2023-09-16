package com.ud;
class T1 extends Thread
{
	Singleton s;
	@Override
	public void run() 
	{
		 s=Singleton.getInstance();
		 System.out.println("s created "+s.hashCode());
	}
}

class T2 extends Thread
{
	Singleton s1;
	@Override
	public void run() {
	
		s1=Singleton.getInstance();
		System.out.println("s1 created "+s1.hashCode());
				
	}
}

public class EarlySinglton 
{
	public static void main(String[] args) 
	{
		T1 t1=new T1();
		T2 t2=new T2();
		t1.run();
		t2.run();
		System.out.println("MUltiple thread  accessing singleton design ");	
	}
}
