package TextMessage;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;

public class TextMessage {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnsupportedEncodingException 
	 */
	public TextMessage() throws UnsupportedEncodingException, IOException {
		// TODO Auto-generated method stub

		String Mobiltext="测试短信！!!!!——屠 Test Test Test";
		HttpClient client = new HttpClient();
		 PostMethod post = new PostMethod("http://gbk.sms.webchinese.cn"); 
		post.addRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=gbk");//在头文件中设置转码
		NameValuePair[] data ={ new NameValuePair("Uid", "yunyingtu"),
				new NameValuePair("Key", "856774b6c85327c18e27"),
				new NameValuePair("smsMob","13651640550"),new NameValuePair("smsText",Mobiltext)};
		post.setRequestBody(data);

		 client.executeMethod(post);
		 Header[] headers = post.getResponseHeaders();
		 int statusCode = post.getStatusCode();
		 System.out.println("statusCode:"+statusCode);
		 for(Header h : headers)
		 {
		 System.out.println(h.toString());
		 }
		 String result = new String(post.getResponseBodyAsString().getBytes("gbk")); 
		System.out.println(result);


		 post.releaseConnection();

		
	}

}
