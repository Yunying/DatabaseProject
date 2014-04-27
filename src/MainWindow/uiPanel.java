package MainWindow;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import Add.AddButtonPanel;
import Alert.AlertPanel;
import Search.SearchButtonPanel;

public class uiPanel extends JPanel{
	JTabbedPane pane = new JTabbedPane();
	AddButtonPanel add = new AddButtonPanel();
	SearchButtonPanel search = new SearchButtonPanel();
	AlertPanel alert = new AlertPanel();
	
	public uiPanel(){
		//Set size and layout
		this.setSize(new Dimension(400,950));
		this.setLayout(new BorderLayout(30,10));
		this.setBounds(10,10,10,10);
		this.setBorder(BorderFactory.createTitledBorder("Configuration"));
		
		//Add Picture
		BufferedImage myPicture = null;
		try {
			myPicture = ImageIO.read(new File("./Logo.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		add(picLabel, BorderLayout.NORTH);
		
		//Add Tabbed Pane
		pane.add("    Alert    ", alert);
		pane.add("        Add        ", add);
		pane.add("    Search    ", search);
		
		add(pane, BorderLayout.CENTER);
	}

}
