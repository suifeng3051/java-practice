package com.heaven.xiancheng;
public class MyThread extends Thread{
	private String name;
	MyThread(String name){
		this.name=name;
	}
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(name+" run "+i);
		}
	}
	public static void main(String[] args) {
		MyThread ta=new MyThread("线程A");
		MyThread tb=new MyThread("线程B");
		//ta.run();
		//tb.run();
		ta.start();
		tb.start();
	}
}
