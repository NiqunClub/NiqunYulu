package club.niqun.entity;

import java.util.Date;

import com.avos.avoscloud.AVUser;

public class User extends AVUser{
	private String objectId;
	private String role;
//	private String email;
//	private String sessionToken;
	private String password;
	private String username;
	private String bio;
	private String mobilePhoneNumber;
	private String location;
	private String avatarUrl;
	private String displayname;
	private Date createdAt;
	private Date updatedAt;
	public String getObjectId() {
		return getString("objectId");
	}
	public void setObjectId(String objectId) {
		put("objectId", objectId);
	}
	public String getRole() {
		return getString("role");
	}
	public void setRole(String role) {
		put("role", role);
	}
	/*public String getPassword() {
		return getString("password");
	}*/
	public void setPassword(String password) {
		put("password", password);
	}
	public String getUsername() {
		return getString("username");
	}
	public void setUsername(String username) {
		put("username", username);
	}
	public String getBio() {
		return getString("bio");
	}
	public void setBio(String bio) {
		put("bio", bio);
	}
	public String getMobilePhoneNumber() {
		return getString("mobilePhoneNumber");
	}
	public void setMobilePhoneNumber(String mobilePhoneNumber) {
		put("mobilePhoneNumber", mobilePhoneNumber);
	}
	public String getLocation() {
		return getString("location");
	}
	public void setLocation(String location) {
		put("location", location);
	}
	public String getAvatarUrl() {
		return getString("avatarUrl");
	}
	public void setAvatarUrl(String avatarUrl) {
		put("avatarUrl", avatarUrl);
	}
	public String getDisplayname() {
		return getString("displayname");
	}
	public void setDisplayname(String displayname) {
		put("displayname", displayname);
	}
	public Date getCreatedAt() {
		return getDate("createdAt");
	}
	public void setCreatedAt(Date createdAt) {
		put("createdAt", createdAt);
	}
	public Date getUpdatedAt() {
		return getDate("updatedAt");
	}
	public void setUpdatedAt(Date updatedAt) {
		put("updatedAt", updatedAt);
	}
	
}
