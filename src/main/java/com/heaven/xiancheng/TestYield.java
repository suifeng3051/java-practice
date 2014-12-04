package com.heaven.xiancheng;

public class TestYield implements Runnable{

	public void run() {
		for(int i=0;i<10;++i){
            System.out.println(Thread.currentThread().getName()+"运行"+i);
            if(i==3){
                System.out.println("线程的礼让");
                Thread.yield();
            }
        }
	}
	 public static void main(String[] args) {
	        Thread h1=new Thread(new TestYield(),"A");
	        Thread h2=new Thread(new TestYield(),"B");
	        h1.start();
	        h2.start();
	    }
}
