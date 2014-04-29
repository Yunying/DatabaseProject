package Add;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AddPerson extends InputInformation implements ActionListener{

	
	
	public AddPerson() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JPanel add(){
		JPanel p = new JPanel();
		p.setBorder(new EmptyBorder(10,10,10,10));
		p.setPreferredSize(new Dimension(400, 400));
		p.setLayout(new BorderLayout(10,10));
		JTextField name = new JTextField(20);
		JTextField email = new JTextField(20);
		JTextField mobile = new JTextField(20);
		JTextField Office = new JTextField(20);
		JTextField fax = new JTextField(20);
		JTextField address = new JTextField(20);
		JTextField company = new JTextField(20);
		JTextField title = new JTextField(20);
		
		JPanel inputs = new JPanel();
		inputs = new JPanel();
		inputs.setLayout(new GridLayout(8,2,10,10));
		
		inputs.add(new JLabel("Name: "));
		inputs.add(name);
		inputs.add(new JLabel("Company: "));
		inputs.add(company);
		inputs.add(new JLabel("Title: "));
		inputs.add(title);
		inputs.add(new JLabel("Email: "));
		inputs.add(email);
		inputs.add(new JLabel("Mobile Phone: "));
		inputs.add(mobile);
		inputs.add(new JLabel("Office Phone: "));
		inputs.add(Office);
		inputs.add(new JLabel("Fax: "));
		inputs.add(fax);
		inputs.add(new JLabel("Address: "));
		inputs.add(address);
		
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
		// TODO Auto-generated method stub
		
	}

}
