package demo.spring;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface TestOutPut {
	
	String username(@WebParam(name="username",targetNamespace="") String text);
	 

}
