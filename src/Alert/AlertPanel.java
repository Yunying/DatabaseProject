package Alert;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class AlertPanel extends JPanel implements ActionListener{
	Dimension buttonDimension = new Dimension(300, 60);
	Calendar cal = Calendar.getInstance();
	JLabel todayIs;
	JLabel time;
	JLabel view;
	JButton five_day;
	JButton ten_day;
	JButton month;
	JButton two_month;
	
	public AlertPanel(){
		setBorder(new EmptyBorder(50, 50, 50, 50));
		this.setLayout(new BorderLayout(10,10));
		
		java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("              yyyy-MM-dd          "); 
		todayIs = new JLabel("Today is: ");
		todayIs.setFont(new Font("Times", Font.BOLD, 20));
		String outTime = format.format(cal.getTime());
		time = new JLabel(outTime);
		time.setFont(new Font("Times", Font.BOLD, 20));
		time.setForeground(Color.BLUE);
		view = new JLabel("View Alerts in: ");
		view.setFont(new Font("Times", Font.BOLD, 20));
		
		//Time Panel
		JPanel times = new JPanel();
		times.setPreferredSize(new Dimension(200,150));
		times.setLayout(new GridLayout(2,1,0,0));
		times.add(todayIs);
		times.add(time);
		
		//Button Panel
		JPanel buttons = new JPanel();
		buttons.setPreferredSize(new Dimension(200,700));
		buttons.setLayout(new GridLayout(5,1,10,40));
		five_day = new JButton("5 days");
		five_day.setPreferredSize(buttonDimension);
		five_day.setMaximumSize(buttonDimension);
		five_day.setMinimumSize(buttonDimension);
		five_day.addActionListener(this);
		
		ten_day = new JButton("10 days");
		ten_day.setPreferredSize(buttonDimension);
		ten_day.setMaximumSize(buttonDimension);
		ten_day.setMinimumSize(buttonDimension);
		ten_day.addActionListener(this);
		
		month = new JButton("1 month");
		month.setPreferredSize(buttonDimension);
		month.setMaximumSize(buttonDimension);
		month.setMinimumSize(buttonDimension);
		month.addActionListener(this);
		
		two_month = new JButton("2 months");
		two_month.setPreferredSize(buttonDimension);
		two_month.setMaximumSize(buttonDimension);
		two_month.setMinimumSize(buttonDimension);
		two_month.addActionListener(this);
		
		buttons.add(view);
		buttons.add(five_day);
		buttons.add(ten_day);
		buttons.add(month);
		buttons.add(two_month);
		
		//Add all
		add(times,BorderLayout.NORTH);
		add(buttons, BorderLayout.CENTER);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
