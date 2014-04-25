package MainWindow;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {

	private JPanel panel;

	// Static variables
	static final int H_EDGE_PADDING = 30;
	static final int V_EDGE_PADDING = 1;
	static final int WINDOW_BOUNDS_BUFFER = 100;
	static final int WINDOW_BOUNDS_Y = 50;
	static final float WINDOW_SCALE_X = 0.25f;
	static final float WINDOW_SCALE_Y = 1.0f;
	static final float WINDOW_SCALE_ANIM = 0.75f;

	public Main() {
		int WINDOWX = 300;
		int WINDOWY = 500;

		setBounds(WINDOW_BOUNDS_Y, WINDOW_BOUNDS_Y, WINDOWX, WINDOWY);

		// Setting up the main panel
		panel = new JPanel();
		panel.setLayout(new BorderLayout());

		JButton button= new JButton("button");
		panel.add(button);

		add(panel);
	}

	public void actionPerformed(ActionEvent e) {

	}

	public static void main(String[] args) {
		Main mainView = new Main();
		mainView.setTitle("My Database");
		mainView.setVisible(true);
		mainView.setResizable(false);
		mainView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}