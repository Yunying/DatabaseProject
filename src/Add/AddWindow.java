package Add;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class AddWindow extends JPanel implements ActionListener{
	public AddWindow(String s){
		
		
		setBorder(new EmptyBorder(10,10,10,10));
		JPanel inputs = new JPanel();
		
		//Notes panel: which will be in every window
		JPanel notes = new JPanel();
		notes.setLayout(new BorderLayout(10,10));
		JTextArea note =new JTextArea(3,5);
		note.setLineWrap(true);
		notes.setBounds(0,0,100,20);
		notes.add(new JLabel("Notes: "), BorderLayout.NORTH);
		notes.add(note,BorderLayout.CENTER);
		
		
		//Temp
		final JTextField txtField1;
		
		if (s == "person"){
			setLayout(new BorderLayout(10,10));
			JTextField name = new JTextField(20);
			JTextField email = new JTextField(20);
			JTextField mobile = new JTextField(20);
			JTextField Office = new JTextField(20);
			JTextField fax = new JTextField(20);
			JTextField address = new JTextField(20);
			JTextField company = new JTextField(20);
			JTextField title = new JTextField(20);
			
			
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
			
			
			//Add two panels to the main panel
			add(inputs, BorderLayout.CENTER);
			add(notes, BorderLayout.SOUTH);
		}
		
		else if (s == "invoice"){
			//Table
			String [] columns = {"Item", "Model", "Single Price", "Amount", "Total Price"};
//			int numRows = 5 ;
//			DefaultTableModel model = new DefaultTableModel(numRows, columns.length) ;
//			model.setColumnIdentifiers(columns);
//			JTable table = new JTable(model);
			JPanel tablePanel = new JPanel();
			tablePanel.setLayout(new BorderLayout());
			tablePanel.setPreferredSize(new Dimension(200,100));
			
			//tPanel
			JPanel tPanel = new JPanel();
			tPanel.setLayout(new BorderLayout(10,10));
			
	        JScrollPane pane = new JScrollPane();
	        JTable table = new JTable();
	        pane.setViewportView(table);
	        JButton btnAdd = new JButton("Add");
	        
	        JPanel northPanel = new JPanel();
	        northPanel.setLayout(new GridLayout(6,2,10,10));
	        txtField1 = new JTextField();
	        final JTextField txtField2 = new JTextField();
	        final JTextField txtField3 = new JTextField();
	        final JTextField txtField4 = new JTextField();
	        final JTextField txtField5 = new JTextField();
	        JLabel lblField1 = new JLabel("Item   ");
	        JLabel lblField2 = new JLabel("Model   ");
	        JLabel lblField3 = new JLabel("Single_Price   ");
	        JLabel lblField4 = new JLabel("Amount   ");
	        JLabel lblField5 = new JLabel("Total_Price");
	        northPanel.add(lblField1);
	        northPanel.add(txtField1);
	        northPanel.add(lblField2);
	        northPanel.add(txtField2);
	        northPanel.add(lblField3);
	        northPanel.add(txtField3);
	        northPanel.add(lblField4);
	        northPanel.add(txtField4);
	        northPanel.add(lblField5);
	        northPanel.add(txtField5);
	        northPanel.add(btnAdd);
	        txtField1.setPreferredSize(lblField1.getPreferredSize());
	        txtField2.setPreferredSize(lblField2.getPreferredSize());
	        txtField3.setPreferredSize(lblField3.getPreferredSize());
	        txtField4.setPreferredSize(lblField4.getPreferredSize());
	        txtField5.setPreferredSize(lblField5.getPreferredSize());

	        
	        final DefaultTableModel tableModel = new DefaultTableModel(columns,0);
	        table.setModel(tableModel);
	        btnAdd.addActionListener(new ActionListener(){
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                int count = tableModel.getRowCount()+1;
	                tableModel.addRow(new Object[]{txtField1.getText(),txtField2.getText(),
	                		txtField3.getText(),txtField4.getText(),
	                		txtField5.getText()});
	                txtField1.setText("");
	                txtField2.setText("");
	                txtField3.setText("");
	                txtField4.setText("");
	                txtField5.setText("");
	            }
	        });
	        
	        //Add everything to the table panel
	        //tablePanel.add(northPanel, BorderLayout.CENTER);
	        tablePanel.add(pane);
	        JLabel lab2 = new JLabel("Invoice Content: ");
			lab2.setForeground(Color.BLUE);
			lab2.setFont(new Font("Times", Font.BOLD, 16));
			tPanel.add(lab2,BorderLayout.NORTH);
	        tPanel.add(northPanel,BorderLayout.CENTER);
	        tPanel.add(tablePanel,BorderLayout.SOUTH);
			
			//Combo Box
			JPanel date = new JPanel();
			date.setLayout(new GridLayout(1,3,10,10));
			date.setBorder(new EmptyBorder(0,0,20,20));
			String [] day = {"1","2","3","4","5","6","7","8","9","10",
					"11","12","13","14","15","16","17","18","19","10",
					"21","22","23","24","25","26","27","28","29","30",};
			String [] month = {"January", "February", "March", "April", "May", "June",
					"July", "August", "September", "October", "November", "December"};
			String [] year = {"2014", "2015","2016", "2017","2018", "2019","2020", "2021",
					"2022", "2023","2024", "2025","2026", "2027","2028", "2029","2030", "2031"};
			JComboBox days = new JComboBox(day);
			JComboBox months = new JComboBox(month);
			JComboBox years = new JComboBox(year);
			date.add(days);
			date.add(months);
			date.add(years);
			

			//JTextField INPUTS
			
			JTextField id = new JTextField(20);
			JTextField company = new JTextField(20);
			JTextField phone = new JTextField(20);
			JTextField total_price = new JTextField(20);

			inputs.setLayout(new GridLayout(4,2,10,10));
			
			inputs.add(new JLabel("ID: "));
			inputs.add(id);
			inputs.add(new JLabel("Company: "));
			inputs.add(company);
			inputs.add(new JLabel("Phone: "));
			inputs.add(phone);
			inputs.add(new JLabel("Total Price: "));
			inputs.add(total_price);
			
			
			//Central Panel
			JPanel center = new JPanel();
			center.setLayout(new BorderLayout(10,10));
			JLabel lab = new JLabel("General Infomation: ");
			lab.setForeground(Color.BLUE);
			lab.setFont(new Font("Times", Font.BOLD, 16));
			center.add(lab, BorderLayout.NORTH);
			center.add(inputs, BorderLayout.CENTER);
			center.add(notes,BorderLayout.SOUTH);
			
			
			//Add two panels to the main panel
			this.setLayout(new BorderLayout(20,20));
			add(date, BorderLayout.NORTH);
			add(tPanel, BorderLayout.SOUTH);
			add(center, BorderLayout.CENTER);
		}
	}
	
	public void addPerson(){
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}
