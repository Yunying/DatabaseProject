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
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
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
		contract.setFont(new Font("Times", Font.BOLD, 15));
		contract.setPreferredSize(buttonDimension);
		contract.setMaximumSize(buttonDimension);
		contract.setMinimumSize(buttonDimension);
		contract.addActionListener(this);
		
		invoice = new JButton("Invoice");
		invoice.setFont(new Font("Times", Font.BOLD, 15));
		invoice.setPreferredSize(buttonDimension);
		invoice.setMaximumSize(buttonDimension);
		invoice.setMinimumSize(buttonDimension);
		invoice.addActionListener(this);
		
		person = new JButton("Person");
		person.setFont(new Font("Times", Font.BOLD, 15));
		person.setPreferredSize(buttonDimension);
		person.setMaximumSize(buttonDimension);
		person.setMinimumSize(buttonDimension);
		person.addActionListener(this);
		
		vendor = new JButton("Company");
		vendor.setFont(new Font("Times", Font.BOLD, 15));
		vendor.setPreferredSize(buttonDimension);
		vendor.setMaximumSize(buttonDimension);
		vendor.setMinimumSize(buttonDimension);
		vendor.addActionListener(this);
		
		event = new JButton("Event");
		event.setFont(new Font("Times", Font.BOLD, 15));
		event.setPreferredSize(buttonDimension);
		event.setMaximumSize(buttonDimension);
		event.setMinimumSize(buttonDimension);
		event.addActionListener(this);
		
		this.add(contract);
		this.add(invoice);
		this.add(person);
		this.add(vendor);
		this.add(event);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(person)){
			AddWindow panel = new AddWindow("person");
			JOptionPane option = new JOptionPane();
			int input = option.showConfirmDialog(null, panel, "Add Contact", JOptionPane.OK_CANCEL_OPTION);
			if (input == JOptionPane.OK_OPTION) {
			    System.out.println("Successfully Add A Contact");
			} else {
			    System.out.println("Canceled");
			}
		}
		
		else if (e.getSource().equals(contract)){
			AddWindow panel = new AddWindow("contract");
			JOptionPane option = new JOptionPane();
			int input = option.showConfirmDialog(null, panel, "Add Contract", JOptionPane.OK_CANCEL_OPTION);
			if (input == JOptionPane.OK_OPTION) {
			    System.out.println("Successfully Add A Contract");
			} else {
			    System.out.println("Canceled");
			}
		}
		
		else if (e.getSource().equals(invoice)){
			addInvoice();
		}
		
		if (e.getSource().equals(vendor)){
			AddWindow panel = new AddWindow("company");
			JOptionPane option = new JOptionPane();
			int input = option.showConfirmDialog(null, panel, "Vendor", JOptionPane.OK_CANCEL_OPTION);
			if (input == JOptionPane.OK_OPTION) {
			    System.out.println("Successfully Add A Company");
			} else {
			    System.out.println("Canceled");
			}
		}
		
		if (e.getSource().equals(event)){
			AddWindow panel = new AddWindow("event");
			JOptionPane option = new JOptionPane();
			int input = option.showConfirmDialog(null, panel, "Add Event", JOptionPane.OK_CANCEL_OPTION);
			if (input == JOptionPane.OK_OPTION) {
			    System.out.println("Successfully Add A Contact");
			} else {
			    System.out.println("Canceled");
			}
		}
		
	}
	
	public void addInvoice(){
		JRadioButton client = new JRadioButton("To Client");
		client.setFont(new Font("Times", Font.BOLD, 15));
		client.setSelected(true);
		JRadioButton vendor = new JRadioButton("From Vendor");
		vendor.setFont(new Font("Times", Font.BOLD, 15));
		ButtonGroup group = new ButtonGroup();
		group.add(client);
		group.add(vendor);
		JPanel buttonPanel = new JPanel();
//		buttonPanel.setBorder(new EmptyBorder(0,0,50,0));
		//buttonPanel.setLayout(new GridLayout(2,1,10,10));
		buttonPanel.add(client);
		buttonPanel.add(vendor);
		int kind = JOptionPane.showConfirmDialog(null, buttonPanel, "Add Invoice", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
		
		if (kind == JOptionPane.OK_OPTION){
			AddWindow panel;
			if (client.isSelected()){
				panel = new AddWindow("invoice_to_client");
				
			}
			else{
				panel = new AddWindow("invoice_from_vendor");
			}
			JOptionPane option = new JOptionPane();
			int input = option.showConfirmDialog(null, panel, "Add Invoice", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
			if (input == JOptionPane.OK_OPTION) {
			    System.out.println("Successfully Add An Invoice");
			} else {
			    System.out.println("Canceled");
			}
		}
	}
	
}
