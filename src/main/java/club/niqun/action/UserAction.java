package club.niqun.action;

import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVOSCloud;
import com.avos.avoscloud.AVObject;
import com.avos.avoscloud.AVUser;
import com.opensymphony.xwork2.Action;

public class UserAction implements Action {
	private String username;
	private String password;
	private String displayname;
	private String bio;
	private String role;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDisplayname() {
		return displayname;
	}

	public void setDisplayname(String displayname) {
		this.displayname = displayname;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String login() {
		AVOSCloud.initialize("brhVd6WgEIjY3Cevgx1SsAOX-gzGzoHsz", "g6yvxgzJ7UICIjRIKEpreVti", "iuTi5rbvejLyQLGTgGtjbyKj");
		AVOSCloud.setDebugLogEnabled(true);
		try {
			AVUser avUser = AVUser.logIn(username, password);
		} catch (AVException e) {
			e.printStackTrace();
			System.out.println(e.getCode());
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String register() {
		AVOSCloud.initialize("brhVd6WgEIjY3Cevgx1SsAOX-gzGzoHsz", "g6yvxgzJ7UICIjRIKEpreVti", "iuTi5rbvejLyQLGTgGtjbyKj");
		AVOSCloud.setDebugLogEnabled(true);
		AVObject testObject = new AVUser();
		testObject.put("username", username);
		testObject.put("password", password);
		testObject.put("displayname", displayname);
		/*testObject.put("role", "master");
		testObject.put("bio", "传说中的管理员。。。弱者是否能挥动强者之剑？！");*/
		try {
			testObject.save();
		} catch (AVException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getCode());
			return ERROR;
		}
		return SUCCESS;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
