package com.demo.test;

import java.net.URL;

import org.dom4j.Document;
import org.junit.Test;

import com.demo.utils.Dom4jUtil;

public class dom4jTest {

	//得到的也是当前ClassPath的绝对URI路径。
	@Test
	public void test01(){
		URL path = Thread.currentThread().getContextClassLoader().getResource("Student.xml"); 
		
		System.out.println(path.toString().substring(6));
		Document dom = Dom4jUtil.getXMLByFilePath(path.toString().substring(6));
		System.out.println(dom.getName());
		System.out.println(dom.getRootElement().getName());
		
	}
	
	@Test
	public void test02(){
		Long tId = 2l;
		System.out.println(tId+"_");
	}
}
