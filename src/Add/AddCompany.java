package Add;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AddCompany extends InputInformation implements ActionListener{
	
	public AddCompany(){

	}
	
	public JPanel add(){
		JPanel p = new JPanel();
		p.setBorder(new EmptyBorder(10,10,10,10));
		p.setPreferredSize(new Dimension(400, 400));
		p.setLayout(new BorderLayout(10,10));
		setLayout(new BorderLayout(10,10));
		JTextField name_c = new JTextField(20);
		JTextField name_e = new JTextField(20);
		JTextField nickname = new JTextField(20);
		JTextField city = new JTextField(20);
		JTextField address = new JTextField(20);
		JTextField zip = new JTextField(20);
		
		JPanel inputs = new JPanel();
		inputs = new JPanel();
		inputs.setLayout(new GridLayout(8,2,10,10));
		
		inputs.add(new JLabel("Name(Chinese): "));
		inputs.add(name_c);
		inputs.add(new JLabel("Name(English): "));
		inputs.add(name_e);
		inputs.add(new JLabel("Nickname: "));
		inputs.add(nickname);
		inputs.add(new JLabel("City: "));
		inputs.add(city);
		inputs.add(new JLabel("Address: "));
		inputs.add(address);
		inputs.add(new JLabel("Zip: "));
		inputs.add(zip);
		inputs.add(new JLabel("Company Type: "));
		JCheckBox vendor = new JCheckBox("Vendor");
		JCheckBox client = new JCheckBox("Client");
		JPanel buttons = new JPanel();
		buttons.setLayout(new GridLayout(1,2,0,0));
		buttons.add(vendor);
		buttons.add(client);
		inputs.add(buttons);

		
		JPanel notes = new JPanel();
		notes.setLayout(new BorderLayout(10,10));
		JTextArea note =new JTextArea(3,5);
		note.setLineWrap(true);
		notes.setBounds(0,0,100,20);
		notes.add(new JLabel("Notes: "), BorderLayout.NORTH);
		notes.add(note,BorderLayout.CENTER);
		
		
		//Add two panels to the main panel
		p.add(inputs, BorderLayout.CENTER);
		p.add(notes, BorderLayout.SOUTH);
		
		return p;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

	}

}
