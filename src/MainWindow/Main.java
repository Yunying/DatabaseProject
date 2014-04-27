package MainWindow;
import java.awt.BorderLayout;
import java.awt.Dimension;





import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Search.SearchButtonPanel;
import Add.AddButtonPanel;

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
	private uiPanel ui = new uiPanel();
	private ListPanel list = new ListPanel();

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
		int WINDOWX = 1800;
		int WINDOWY = 950;
		setBounds(WINDOW_BOUNDS_Y, WINDOW_BOUNDS_Y, WINDOWX, WINDOWY);

		// Setting up the main panel
		panel.setLayout(new BorderLayout(10,0));
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));

		//Two big panels
		panel.add(ui,BorderLayout.LINE_START);
		panel.add(list,BorderLayout.CENTER);
		
		//Add Main Panel to Frame
		add(panel);
	}

	public void actionPerformed(ActionEvent e) {

	}


	public static void main(String[] args) {
		Main mainView = new Main();
		Database database = new Database();
		mainView.setTitle("My Database");
		mainView.setVisible(true);
		mainView.setResizable(false);
		mainView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}