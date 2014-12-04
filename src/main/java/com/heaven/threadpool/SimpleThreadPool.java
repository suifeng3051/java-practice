package com.heaven.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*******************************************************************************
 * 版权信息：博睿宏远科技发展有限公司
 * Copyright: Copyright (c) 2007博睿宏远科技发展有限公司,Inc.All Rights Reserved.
 * 
 * BidPlanStructForm.java Created on 2014-5-4
 * Author: <a href=mailto:wanghd@bonree.com>王厚达</a>
 * @Title: SimpleThreadPool.java
 * @Package com.heaven.threadpool
 * Description:
 * Version: 1.0
 ******************************************************************************/
public class SimpleThreadPool {
	 public static void main(String[] args) {
	        ExecutorService executor = Executors.newFixedThreadPool(5);
	        for (int i = 0; i < 10; i++) {
	            Runnable worker = new WorkThread("task--" + i);
	            executor.execute(worker);
	          }
	        executor.shutdown();
	        while (!executor.isTerminated()) {
	        }
	        System.out.println("Finished all threads");
	    }
}

