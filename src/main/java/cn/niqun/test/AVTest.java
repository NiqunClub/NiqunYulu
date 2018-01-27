package cn.niqun.test;

import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVOSCloud;
import com.avos.avoscloud.AVObject;

public class AVTest {

	public static void main(String[] args) {
		// 参数依次为 AppId、AppKey、MasterKey
		AVOSCloud.initialize("brhVd6WgEIjY3Cevgx1SsAOX-gzGzoHsz", "g6yvxgzJ7UICIjRIKEpreVti", "iuTi5rbvejLyQLGTgGtjbyKj");
		AVOSCloud.setDebugLogEnabled(true);
		AVObject testObject = new AVObject("Niqun");
		testObject.put("username", "三哥");
		testObject.put("bio", "真实大手子");
		try {
			testObject.save();
		} catch (AVException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
