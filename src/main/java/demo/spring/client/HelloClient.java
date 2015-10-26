package demo.spring.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import demo.spring.HelloWorld;
import demo.spring.TestOutPut;

public class HelloClient {

	
	
	
	public static void main(String[] args) {
			  //����WebService�ͻ��˴��?��
			  JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
			  //ע��WebService�ӿ�
			  factory.setServiceClass(TestOutPut.class);
			  //����WebService��ַ
			  factory.setAddress("http://192.168.219.40:8080/wsdlTest/service/TestOutPut?wsdl");
			  TestOutPut testOutPut= (TestOutPut)factory.create();
			  System.out.println("invoke webservice...");
			  System.out.println("message context is:"+testOutPut.username("test"));  
			  
//			  factory.setServiceClass(HelloWorld.class);
//			  factory.setAddress("http://10.23.24.247:8080/wsdlTest/service/HelloWorld?wsdl");
//			  HelloWorld helloWorld= (HelloWorld)factory.create();
//			  System.out.println("invoke webservice...");
//			  System.out.println("message context is:"+helloWorld.stringInt("asdfasd", 1));  
			  
	}
}
