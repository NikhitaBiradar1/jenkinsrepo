package org.packagetest2;

import org.testng.annotations.Test;

import com.genericutility.BaseClass;

public class script4Test extends BaseClass {
	@Test (groups =  "ST")
	public void test1()
	{
		System.out.println("script4Test --> test1");
	}
	@Test (groups =  "RT")
	public void test2()
	{
		System.out.println("script4Test --> test2");
		System.out.println("Stop");
		System.out.println("Stop");
	}

}
