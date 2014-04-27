package Mail;
import java.util.Date;
import java.util.Properties;
import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.SendFailedException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mail {

		private String host = "smtp.gmail.com";
		
		private String mail_head_name = "this is head of this mail";
		
		private String mail_head_value = "this is head of this mail";
		
		private String mail_to = "514045681@qq.com";
		
		private String mail_from = "yunyingtu@gmail.com";
		
		private String mail_subject = "this is the subject of this test mail";
		
		private String mail_body = "this is mail_body of this test mail";
		
		private String personalName = "我的邮件";

		
		public void sendMail() throws SendFailedException{
			try {
				Properties props = new Properties();//获取系统环境
				Authenticator auth = new Email_Autherticator();//进行邮件服务用户认证
				props.put("mail.smtp.host", host);
				props.put("mail.smtp.auth", "true");
				props.put("mail.smtp.starttls.enable", "true");
				System.out.println(props);
				Session session = Session.getDefaultInstance(props,auth);
				//设置session,和邮件服务器进行通讯
				MimeMessage message = new MimeMessage(session);
				message.setContent("Hello","text/plain");//设置邮件格式
				message.setSubject(mail_subject);//设置邮件主题
				message.setText(mail_body);//设置邮件内容
				message.setHeader(mail_head_name, mail_head_value);//设置邮件标题
				message.setSentDate(new Date());//设置邮件发送时期
				Address address = new InternetAddress(mail_from,personalName);
				message.setFrom(address);//设置邮件发送者的地址
				Address toaddress = new InternetAddress(mail_to);//设置邮件接收者的地址
				message.addRecipient(Message.RecipientType.TO,toaddress);
				System.out.println(message);
				Transport.send(message);
				System.out.println("Send Mail Ok!");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Failed");
			}
			//return flag;
		}
		
		public void writeEmail(){
			
		}
	
}
