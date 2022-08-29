package org.packagetest1;

import org.testng.annotations.Test;

import com.genericutility.BaseClass;

public class script2Test extends BaseClass {
	@Test (groups =  "ST")
	public void test1()
	{
		System.out.println("script2Test --> test1");
	}
	@Test (groups = "RT")
	public void test2()
	{
		System.out.println("script2Test --> test2");
	}

}
