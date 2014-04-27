package MainWindow;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ListPanel extends JPanel{
	public ListPanel(){
		setSize(new Dimension(1300, 950));
		setBorder(BorderFactory.createTitledBorder("Information"));
	}
}
