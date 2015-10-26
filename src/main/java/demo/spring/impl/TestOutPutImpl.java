/*package demo.spring.impl;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import demo.spring.TestOutPut;


@WebService(endpointInterface = "demo.spring.TestOutPut")
public class TestOutPutImpl implements TestOutPut {

	private Logger logger = LoggerFactory.getLogger(TestOutPutImpl.class);
	
	private String name ;
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String username(String text) {
		logger.info("spring setter into name is "+name);
	//	System.out.println(text+name);
		logger.info("%%%%%%%%%%%%%%%%%%"+text+name);
		return text+name;
	}

}
*/