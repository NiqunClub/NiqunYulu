package club.niqun.test;

import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVOSCloud;
import com.avos.avoscloud.AVObject;
import com.avos.avoscloud.AVUser;

public class AVTest {

	public static void main(String[] args) {
		// 参数依次为 AppId、AppKey、MasterKey
		AVOSCloud.initialize("brhVd6WgEIjY3Cevgx1SsAOX-gzGzoHsz", "g6yvxgzJ7UICIjRIKEpreVti", "iuTi5rbvejLyQLGTgGtjbyKj");
		AVOSCloud.setDebugLogEnabled(true);
		AVObject testObject = new AVUser();
		testObject.put("username", "admin");
		testObject.put("password", "xiamentiananmen");
		testObject.put("displayname", "超级管理员");
		testObject.put("role", "master");
		testObject.put("bio", "传说中的管理员。。。弱者是否能挥动强者之剑？！");
		try {
			testObject.save();
		} catch (AVException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
