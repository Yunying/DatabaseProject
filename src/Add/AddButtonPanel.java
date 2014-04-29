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
	JButton po;
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
		
		po = new JButton("Purchase Order");
		po.setFont(new Font("Times", Font.BOLD, 15));
		po.setPreferredSize(buttonDimension);
		po.setMaximumSize(buttonDimension);
		po.setMinimumSize(buttonDimension);
		po.addActionListener(this);
		
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
	
		this.add(contract);
		this.add(invoice);
		this.add(person);
		this.add(vendor);
		this.add(po);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(person)){
			AddPerson panel = new AddPerson();
			panel.input("Add Contact", panel.add());
			
		}
		
		else if (e.getSource().equals(contract)){

		}
		
		else if (e.getSource().equals(invoice)){
			AddInvoice panel = new AddInvoice();
			panel.input();
		}
		
		if (e.getSource().equals(vendor)){
			AddCompany panel = new AddCompany();
			panel.input("Add Company", panel.add());
		}
		
		if (e.getSource().equals(po)){
//			AddWindow panel = new AddWindow("event");
//			JOptionPane option = new JOptionPane();
//			int input = option.showConfirmDialog(null, panel, "Add Event", JOptionPane.OK_CANCEL_OPTION);
//			if (input == JOptionPane.OK_OPTION) {
//			    System.out.println("Successfully Add A Contact");
//			} else {
//			    System.out.println("Canceled");
//			}
		}
		
	}

	
}
