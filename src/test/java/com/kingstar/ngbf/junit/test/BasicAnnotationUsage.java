package com.kingstar.ngbf.junit.test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BasicAnnotationUsage {
	
	private Map<String, Object> attributes;
	
	/**
	 * 该方法执行在测试生命周期的开始时，生命周期的第一个执行方法。
	 * 可以在这个方法中，进行一次性的初始化。
	 * 注意该方法为static。
	 */
	@BeforeClass
	public static void onCreate(){
		System.out.println("测试开始");
	}
	
	/**
	 * 该方法执行在测试生命周期的结束时，生命周期的最后一个执行方法。
	 * 可以在这个方法中，进行一次性的资源回收.
	 * 注意该方法为static。
	 */
	@AfterClass
	public static void onDestory(){
		System.out.println("测试结束");
	}
	
	/**
	 * 该方法将在每一个test方法执行前被调用。
	 * 可以用来做数据初始化等。
	 */
	@Before
	public void beforeEachTest(){
		System.out.println("单元测试开始前");
		attributes = new HashMap<String, Object>();
	}
	
	/**
	 * 该方法将在每一个test方法执行后被调用。
	 * 可以用来做资源回收。
	 */
	@After
	public void afterEachTest(){
		System.out.println("单元测试结束后");
		attributes.clear();
	}
	
	/**
	 * 测试1
	 */
	@Test
	public void testSuccess(){
		System.out.println("测试1");
		String hello = "Hello";
		String shanghai = "Shanghai";
		attributes.put(hello, shanghai);
		assertTrue("这不是真的！", attributes.get(hello).equals(shanghai));
	}
	
	/**
	 * 测试2
	 */
	@Test
	public void testFailure(){
		System.out.println("测试2");
		assertEquals("1.0 不等于 1.1", 1.0, 1.1, 0);
	}

}
