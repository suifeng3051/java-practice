package com.heaven.designpattern.factory;

import java.math.BigDecimal;

/**商场计费软件父类**/
public abstract class CashSuper { 
	public abstract BigDecimal acceptCash(BigDecimal cash);
	
}
