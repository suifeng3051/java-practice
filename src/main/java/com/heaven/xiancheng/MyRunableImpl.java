package com.heaven.xiancheng;
public class MyRunableImpl implements Runnable{
	MyRunableImpl(String name){
		this.name=name;
	}
	private String name;

	public void run() {
		for(int i=0;i<5;i++){
			System.out.println(name+" run "+i);
		}
	}
	public static void main(String[] args) {
		MyRunableImpl ra=new MyRunableImpl("线程A");
		MyRunableImpl rb=new MyRunableImpl("线程B");
		//ra.run();
		//rb.run();
		Thread ta=new Thread(ra);
		Thread tb=new Thread(rb);
		ta.start();
		tb.start();
	}
}
