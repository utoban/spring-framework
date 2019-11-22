package com.atguigu.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest_Xml {


	@Test
	public void test01(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println(ctx);
	}

	/*public static void main(String args[]) {
		System.out.println("test");
	}*/

}
