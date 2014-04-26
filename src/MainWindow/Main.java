package MainWindow;
import java.awt.Dimension;


import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main extends JFrame implements ActionListener {
	
	//Panels
	private JPanel panel = new JPanel();
	private AddButtonPanel addPanel = new AddButtonPanel();
	private SearchButtonPanel searchPanel = new SearchButtonPanel();

	// Static variables
	static final int H_EDGE_PADDING = 30;
	static final int V_EDGE_PADDING = 1;
	static final int WINDOW_BOUNDS_BUFFER = 100;
	static final int WINDOW_BOUNDS_Y = 50;
	static final float WINDOW_SCALE_X = 0.25f;
	static final float WINDOW_SCALE_Y = 1.0f;
	static final float WINDOW_SCALE_ANIM = 0.75f;

	public Main() {
		//Set Size
		int WINDOWX = 400;
		int WINDOWY = 500;
		setBounds(WINDOW_BOUNDS_Y, WINDOW_BOUNDS_Y, WINDOWX, WINDOWY);

		// Setting up the main panel
		panel.setLayout(new BorderLayout(0, 50));
		panel.setBorder(new EmptyBorder(50, 50, 50, 50));
		panel.setBackground(new Color(59,176,255));

		//Add Picture
		BufferedImage myPicture = null;
		try {
			myPicture = ImageIO.read(new File("./Logo.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		panel.add(picLabel, BorderLayout.NORTH);
		
		// Setting up the two button panels
		panel.add(addPanel, BorderLayout.CENTER);
		panel.add(searchPanel, BorderLayout.SOUTH);
		
		
		//Add Main Panel to Frame
		add(panel);
	}

	public void actionPerformed(ActionEvent e) {

	}
	
	public void linkToDatabase(){
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

	public static void main(String[] args) {
		Main mainView = new Main();
		mainView.linkToDatabase();
		mainView.setTitle("My Database");
		mainView.setVisible(true);
		mainView.setResizable(false);
		mainView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}