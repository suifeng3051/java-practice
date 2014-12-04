package com.heaven.threadpool;

import java.util.Random;

/*******************************************************************************
 * 版权信息：博睿宏远科技发展有限公司
 * Copyright: Copyright (c) 2007博睿宏远科技发展有限公司,Inc.All Rights Reserved.
 * 
 * BidPlanStructForm.java Created on 2014-5-4
 * Author: <a href=mailto:wanghd@bonree.com>王厚达</a>
 * @Title: SimplePrintJob.java
 * @Package com.heaven.threadpool
 * Description:
 * Version: 1.0
 ******************************************************************************/
public class SimplePrintJob  implements Runnable {  
	    private String jobName;  
	    public SimplePrintJob(String jobName) {  
	        this.jobName = jobName;  
	    }    
	    public void run() {  
	        System.out.println("[ " + jobName + " ] start...");  
	        int random = 0;  
	        try {  
	            Random r = new Random();  
	            random = r.nextInt(10);  
	            Thread.sleep(random * 1000L);  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	        System.out.println("[ " + jobName + " ] end with sleep:" + random);  
	    }  
}

