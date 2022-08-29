package org.packagetest1;

import org.testng.annotations.Test;

import com.genericutility.BaseClass;

public class script1Test extends BaseClass{
	@Test (groups = "ST")
	public void test1()
	{
		System.out.println("Start");
		System.out.println("Start");
		System.out.println("script1Test --> test1");
	}

}
