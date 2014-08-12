package com.kingstar.ngbf.junit.test;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class ParameterizedUsage {
	
	private String city;
	
	private Integer population;
	
	public ParameterizedUsage(String city, Integer population) {
		this.city = city;
		this.population = population;
	}
	
	/**
	 * 提供实例化的参数组。
	 * 注意该为static方法。
	 * @return
	 */
	@Parameters
	public static Collection<Object[]> candidates(){
		Object[][] data = new Object[][]{{"SH", 120}, {"BJ", 130},{"GZ", 110}};
		return Arrays.asList(data);
	}
	
	
	@Test
	 public void test() {
	   System.out.println("城市: " + this.city + "， 人口：" + this.population + "万。");
	 }
}
