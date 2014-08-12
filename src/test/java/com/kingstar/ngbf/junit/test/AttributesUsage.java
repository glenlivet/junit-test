package com.kingstar.ngbf.junit.test;


import org.junit.Ignore;
import org.junit.Test;


public class AttributesUsage {
	
	/**
	 * 该方法必须在1000ms内返回，不然就会抛出异常
	 */
	@Test(timeout = 1000)  
	public void infinity() {  
		System.out.println("Timeout测试");
		while (true);  
		
	}  
	
	/**
	 * 该测试期待抛出NullPointerException。如果抛出了，则测试通过，反之，则不通过。
	 */
	@Test(expected = NullPointerException.class)
	public void nullpointerException(){
		System.out.println("expected exception测试");
		Object o = null;
		o.toString();
	}
	
	/**
	 * 用Ignore来暂时不测试某个方法
	 */
	@Ignore
	@Test
	public void notRun(){
		System.out.println("该方法不会被测试");
	}
}
