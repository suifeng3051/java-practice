package com.heaven.designpattern.factory;

import java.math.BigDecimal;

public class OperationSub extends Operation{

	@Override
	public BigDecimal getResult() {
		
		return super.operatorA.subtract(super.operatorB);
	}

}
