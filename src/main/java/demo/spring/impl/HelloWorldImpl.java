package demo.spring.impl;

import javax.jws.WebService;

import demo.spring.HelloWorld;
import entity.MyObject;
 
@WebService(endpointInterface = "demo.spring.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
 
	public String stringInt(String text, int num, long age) {
		System.out.print("stringInt called");
		return text+"   "+num;
	}
 
	public MyObject[] aryMyObjects(MyObject[] myObjects) {
		MyObject[] ary=new MyObject[myObjects.length];
		for(int i=0;i<ary.length;i++){
			ary[i]=new MyObject();
			ary[i].setId(myObjects[i].getId()+i);
			ary[i].setName(myObjects[i].getName()+"  "+i);
		}
		return ary;
	}
	
	
}

