package Add;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class AddButtonPanel extends JPanel implements ActionListener{
	Dimension buttonDimension = new Dimension(300, 60);
	JButton person;
	JButton contract;
	JButton invoice;
	JButton vendor;
	JButton event;
	JLabel lab;

	public AddButtonPanel(){
		setBorder(new EmptyBorder(50, 50, 50, 50));
		setLayout(new GridLayout(6,1,10,50));
		
		//AddLabel
		addLabel();
		
		//AddButtons
		addButtons();
	}
	
	public void addLabel(){
		lab = new JLabel("Choose an item to add to the database");
		lab.setPreferredSize(buttonDimension);
		lab.setMaximumSize(buttonDimension);
		lab.setMinimumSize(buttonDimension);
		lab.setFont(new Font("Serif", Font.PLAIN, 20));
		lab.setForeground(new Color(40,77,255));
		
		this.add(lab);
	}
	
	public void addButtons(){
		contract = new JButton("Contract");
		contract.setPreferredSize(buttonDimension);
		contract.setMaximumSize(buttonDimension);
		contract.setMinimumSize(buttonDimension);
		contract.addActionListener(this);
		
		invoice = new JButton("Invoice");
		invoice.setPreferredSize(buttonDimension);
		invoice.setMaximumSize(buttonDimension);
		invoice.setMinimumSize(buttonDimension);
		invoice.addActionListener(this);
		
		person = new JButton("Person");
		person.setPreferredSize(buttonDimension);
		person.setMaximumSize(buttonDimension);
		person.setMinimumSize(buttonDimension);
		invoice.addActionListener(this);
		
		vendor = new JButton("Vendor");
		vendor.setPreferredSize(buttonDimension);
		vendor.setMaximumSize(buttonDimension);
		vendor.setMinimumSize(buttonDimension);
		invoice.addActionListener(this);
		
		event = new JButton("Event");
		event.setPreferredSize(buttonDimension);
		event.setMaximumSize(buttonDimension);
		event.setMinimumSize(buttonDimension);
		invoice.addActionListener(this);
		
		this.add(contract);
		this.add(invoice);
		this.add(person);
		this.add(vendor);
		this.add(event);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
