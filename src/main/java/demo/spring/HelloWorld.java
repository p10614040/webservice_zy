package demo.spring;

import javax.jws.WebParam;
import javax.jws.WebService;

import entity.MyObject;

@WebService
public interface HelloWorld {
	String stringInt(
			@WebParam(name = "text", targetNamespace = "http://spring.demo/") String text,
			@WebParam(name = "num", targetNamespace = "http://spring.demo/") int num, long age);

	MyObject[] aryMyObjects(
			@WebParam(name = "myObjects", targetNamespace = "http://spring.demo/") MyObject[] myObjects);
}
