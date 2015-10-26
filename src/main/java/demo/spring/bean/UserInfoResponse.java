package demo.spring.bean;

public class UserInfoResponse {
	private String userid ;
	
	private String username ;
	
	private int age;
	
	private boolean sex ;
	
	private String home;

	public UserInfoResponse() {
		super();
	}

	public UserInfoResponse(String userid, String username, int age, boolean sex,
			String home) {
		super();
		this.userid = userid;
		this.username = username;
		this.age = age;
		this.sex = sex;
		this.home = home;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	
	@Override
	public String toString() {
		StringBuffer sbr = new StringBuffer();
		sbr.append("[userid=");
		sbr.append(userid);
		sbr.append(",");
		sbr.append("username=");
		sbr.append(username);
		sbr.append(",");
		sbr.append("age=");
		sbr.append(age);
		sbr.append(",");
		sbr.append("sex=");
		sbr.append(sex==true?"1":0);
		sbr.append(",");
		sbr.append("home");
		sbr.append(home);
		sbr.append("]"); 
		return sbr.toString();
	}
	
}
