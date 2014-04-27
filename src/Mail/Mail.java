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
		
		private String personalName = "�ҵ��ʼ�";

		
		public void sendMail() throws SendFailedException{
			try {
				Properties props = new Properties();//��ȡϵͳ����
				Authenticator auth = new Email_Autherticator();//�����ʼ������û���֤
				props.put("mail.smtp.host", host);
				props.put("mail.smtp.auth", "true");
				props.put("mail.smtp.starttls.enable", "true");
				System.out.println(props);
				Session session = Session.getDefaultInstance(props,auth);
				//����session,���ʼ�����������ͨѶ
				MimeMessage message = new MimeMessage(session);
				message.setContent("Hello","text/plain");//�����ʼ���ʽ
				message.setSubject(mail_subject);//�����ʼ�����
				message.setText(mail_body);//�����ʼ�����
				message.setHeader(mail_head_name, mail_head_value);//�����ʼ�����
				message.setSentDate(new Date());//�����ʼ�����ʱ��
				Address address = new InternetAddress(mail_from,personalName);
				message.setFrom(address);//�����ʼ������ߵĵ�ַ
				Address toaddress = new InternetAddress(mail_to);//�����ʼ������ߵĵ�ַ
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
