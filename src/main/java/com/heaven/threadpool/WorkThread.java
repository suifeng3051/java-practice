package com.heaven.threadpool;

import java.util.Random;

/*******************************************************************************
 * 版权信息：博睿宏远科技发展有限公司
 * Copyright: Copyright (c) 2007博睿宏远科技发展有限公司,Inc.All Rights Reserved.
 * 
 * BidPlanStructForm.java Created on 2014-5-4
 * Author: <a href=mailto:wanghd@bonree.com>王厚达</a>
 * @Title: WorkThread.java
 * @Package com.heaven.threadpool
 * Description:
 * Version: 1.0
 ******************************************************************************/
public class WorkThread implements Runnable{
	private String taskId;
    public WorkThread(String s){
        this.taskId=s;
    }
  
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Start  task = "+taskId);
        processCommand();
        System.out.println(Thread.currentThread().getName()+" End task .");
    }
    private void processCommand() {
        try {
        	int random=0;
        	 Random r = new Random();  
	         random = r.nextInt(10);  
	        // System.out.println(taskId+"--sleep time="+random * 1000L);
	         Thread.sleep(random * 1000L);  
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public String toString(){
        return this.taskId;
    }
}

