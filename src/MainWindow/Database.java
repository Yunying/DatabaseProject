package MainWindow;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	public Database(){
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/tysql";
		String user = "root";
		String password = "shumybest";
		try{
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, password);
			if (!conn.isClosed())
				System.out.println("Succeeded connecting to the Database!");
			Statement statement = conn.createStatement();
			String sql = "select * from products";
			ResultSet rs = statement.executeQuery(sql);
			System.out.println("--------------------------");
			System.out.println("Results are shown below");
			System.out.println("--------------------------");
			String name = null;
			while(rs.next()){
				name = rs.getString("prod_name");
				name = new String(name.getBytes("ISO-8859-1"),"GB2312");
				System.out.println(rs.getString("prod_price") + "\t" + name);
			}
			rs.close();
			conn.close();
		}catch (ClassNotFoundException e){
			System.out.println("Sorry, can't find the driver!");
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
