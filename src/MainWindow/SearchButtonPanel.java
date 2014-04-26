package MainWindow;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class SearchButtonPanel extends JPanel implements ActionListener{

	public SearchButtonPanel(){
		JButton searchButton = new JButton("Search");
		Dimension buttonDimension = new Dimension(100, 60);
		searchButton.setPreferredSize(buttonDimension);
		searchButton.setMaximumSize(buttonDimension);
		searchButton.setMinimumSize(buttonDimension);
		
		setLayout(new BorderLayout());
		add(searchButton,BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
