package com.heaven.threadpool;


import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/*******************************************************************************
 * 版权信息：博睿宏远科技发展有限公司
 * Copyright: Copyright (c) 2007博睿宏远科技发展有限公司,Inc.All Rights Reserved.
 * 
 * BidPlanStructForm.java Created on 2014-5-4
 * Author: <a href=mailto:wanghd@bonree.com>王厚达</a>
 * @Title: JavaThreadPool.java
 * @Package com.heaven.threadpool
 * Description:
 * Version: 1.0
 ******************************************************************************/
public class JavaThreadPool {
	public static void main(String[] args) {
		 ThreadPoolExecutor threadPool = new ThreadPoolExecutor(3, 5, 60,  
	                TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(10),  
	                new ThreadPoolExecutor.CallerRunsPolicy());  
	        for (int i = 0; i < 10; i++) {  
	            System.out.println("add job_" + i + " at:" + new Date());  
	            SimplePrintJob job = new SimplePrintJob("job_" + i);  
	            threadPool.execute(job);  
	        }  
	        System.out.println("execute all job");  
	        threadPool.shutdown();  
	        System.out.println("main program end-----------"); 
	}
}

