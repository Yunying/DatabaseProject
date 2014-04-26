package MainWindow;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;


public class LogoPanel extends JPanel{

	public LogoPanel(){
		JButton addButton = new JButton("Add");
		Dimension buttonDimension = new Dimension(400, 80);
		addButton.setPreferredSize(buttonDimension);
		addButton.setMaximumSize(buttonDimension);
		addButton.setMinimumSize(buttonDimension);
		
		setLayout(new BorderLayout());
		setBackground(new Color(59,176,255));
		add(addButton, BorderLayout.SOUTH);
	}

	
}