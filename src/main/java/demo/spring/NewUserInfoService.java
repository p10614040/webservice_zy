package demo.spring;

import javax.jws.WebParam;
import javax.jws.WebService;

import demo.spring.bean.UserInfoInput;
import demo.spring.bean.UserInfoResponse;

@WebService
public interface NewUserInfoService {

	UserInfoResponse addUserRequest(
			@WebParam(name = "userInfo", targetNamespace = "http://spring.demo/") UserInfoInput userInfo);
}
