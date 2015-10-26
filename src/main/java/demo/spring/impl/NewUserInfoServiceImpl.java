/*package demo.spring.impl;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import demo.spring.NewUserInfoService;
import demo.spring.bean.UserInfoInput;
import demo.spring.bean.UserInfoResponse;

@WebService(endpointInterface = "demo.spring.NewUserInfoService")
public class NewUserInfoServiceImpl implements NewUserInfoService{

	private Logger logger = LoggerFactory.getLogger(NewUserInfoServiceImpl.class);
	
	@Override
	public UserInfoResponse addUserRequest(UserInfoInput userInfoInput) {
		logger.info("Client���� webservice������û���Ϣ��:"+userInfoInput.toString());
		UserInfoResponse userInfoResponse = new UserInfoResponse();
		userInfoResponse.setUserid("1  "+userInfoInput.getUserid());
		userInfoResponse.setAge( 1+ userInfoInput.getAge());
		userInfoResponse.setHome("1  "+userInfoInput.getHome());
		userInfoResponse.setSex(false);
		userInfoResponse.setUsername("1  "+userInfoInput.getUsername());
		return userInfoResponse;
	}

}
*/