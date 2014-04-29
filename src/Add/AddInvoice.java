package Add;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class AddInvoice extends InputInformation implements ActionListener{
	public AddInvoice(){

	}
	
	public JPanel add(int a){
		//Global
		JPanel p = new JPanel();
		p.setBorder(new EmptyBorder(10,10,10,10));
		p.setPreferredSize(new Dimension(600, 900));
		
		//Table
				String [] columns = {"Item", "Model", "Single Price", "Amount", "Total Price"};
//				int numRows = 5 ;
//				DefaultTableModel model = new DefaultTableModel(numRows, columns.length) ;
//				model.setColumnIdentifiers(columns);
//				JTable table = new JTable(model);
				JPanel tablePanel = new JPanel();
				tablePanel.setLayout(new BorderLayout());
				tablePanel.setPreferredSize(new Dimension(200,100));
				
				//tPanel
				JPanel tPanel = new JPanel();
				tPanel.setPreferredSize(new Dimension(400,400));
				tPanel.setLayout(new BorderLayout(10,10));
				
		        JScrollPane pane = new JScrollPane();
		        JTable table = new JTable();
		        pane.setViewportView(table);
		        JButton btnAdd = new JButton("Add");
		        
		        JPanel northPanel = new JPanel();
		        northPanel.setLayout(new GridLayout(6,2,20,10));
		        final JTextField txtField1;
		        txtField1 = new JTextField();
		        final JTextField txtField2 = new JTextField();
		        final JTextField txtField3 = new JTextField();
		        final JTextField txtField4 = new JTextField();
		        final JTextField txtField5 = new JTextField();
		        JLabel lblField1 = new JLabel("Item   ");
		        JLabel lblField2 = new JLabel("Model   ");
		        JLabel lblField3 = new JLabel("Single_Price   ");
		        JLabel lblField4 = new JLabel("Amount   ");
		        JLabel lblField5 = new JLabel("Item_Total_Price");
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
				
				//Combo Box - date
				JPanel date = new JPanel();
				date.setLayout(new GridLayout(1,3,10,10));
				//date.setBorder(new EmptyBorder(0,0,20,20));
				String [] day = {"1","2","3","4","5","6","7","8","9","10",
						"11","12","13","14","15","16","17","18","19","10",
						"21","22","23","24","25","26","27","28","29","30",};
				String [] month = {"January", "February", "March", "April", "May", "June",
						"July", "August", "September", "October", "November", "December"};
				String [] year = {"2013", "2014", "2015","2016", "2017","2018", "2019","2020", "2021",
						"2022", "2023","2024", "2025","2026", "2027","2028", "2029","2030", "2031"};
				JComboBox days = new JComboBox(day);
				JComboBox months = new JComboBox(month);
				JComboBox years = new JComboBox(year);
				date.add(days);
				date.add(months);
				date.add(years);
				

				//JTextField INPUTS
				String [] types = {"增值税发票", "增值税普通发票","建筑业专用发票"};
				JComboBox invoice_type = new JComboBox(types);
				
				JTextField id = new JTextField(20);
				JTextField company = new JTextField(20);
				JTextField order_id = new JTextField(20);
				JTextField total_price = new JTextField(20);
				JRadioButton paid = new JRadioButton("Paid");
				JRadioButton unpaid = new JRadioButton("Unpaid");
				ButtonGroup group = new ButtonGroup();
				group.add(paid);
				group.add(unpaid);
				JPanel tempButton = new JPanel();
				tempButton.add(paid);
				tempButton.add(unpaid);
				final JTextField paid_amount = new JTextField(20);
				String [] day2 = {"1","2","3","4","5","6","7","8","9","10",
						"11","12","13","14","15","16","17","18","19","10",
						"21","22","23","24","25","26","27","28","29","30",};
				String [] month2 = {"January", "February", "March", "April", "May", "June",
						"July", "August", "September", "October", "November", "December"};
				String [] year2 = {"2013", "2014", "2015","2016", "2017","2018", "2019","2020", "2021",
						"2022", "2023","2024", "2025","2026", "2027","2028", "2029","2030", "2031"};
				final JComboBox days2 = new JComboBox(day2);
				final JComboBox months2 = new JComboBox(month2);
				final JComboBox years2 = new JComboBox(year2);
				JPanel date2 = new JPanel();
				date2.setLayout(new GridLayout(1,3,10,10));
				date2.add(days2);
				date2.add(months2);
				date2.add(years2);
				paid_amount.setEnabled(false);
		        days2.setEnabled(false);
		        months2.setEnabled(false);
		        years2.setEnabled(false);
				
				paid.addActionListener(new ActionListener() {
		 
		            public void actionPerformed(ActionEvent e)
		            {
		                paid_amount.setEnabled(true);
		                days2.setEnabled(true);
		                months2.setEnabled(true);
		                years2.setEnabled(true);
		            }
		        });  
				
				unpaid.addActionListener(new ActionListener() {
					 
		            public void actionPerformed(ActionEvent e)
		            {
		            	paid_amount.setEnabled(false);
		                days2.setEnabled(false);
		                months2.setEnabled(false);
		                years2.setEnabled(false);
		            }
		        });  
				
				JPanel inputs = new JPanel();
				inputs.setLayout(new GridLayout(9,2,10,10));
				
				inputs.add(new JLabel("Invoice Date: "));
				inputs.add(date);
				inputs.add(new JLabel("Invoice Type: "));
				inputs.add(invoice_type);
				inputs.add(new JLabel("Invoice ID: "));
				inputs.add(id);
				if (a == 1){
					inputs.add(new JLabel("Purchase Order ID: "));
				}
				else{
					inputs.add(new JLabel("Contract ID: "));
				}
				inputs.add(order_id);
				inputs.add(new JLabel("Vendor: "));
				inputs.add(company);
				inputs.add(new JLabel("Total Price: "));
				inputs.add(total_price);
				inputs.add(new JLabel("Status"));
				inputs.add(tempButton);
				inputs.add(new JLabel("If paid, how much?"));
				inputs.add(paid_amount);
				inputs.add(new JLabel("If paid, which date?"));
				inputs.add(date2);
				
				
				
				//Central Panel
				JPanel center = new JPanel();
				center.setPreferredSize(new Dimension(400,500));
				center.setLayout(new BorderLayout(20,10));
				
				JLabel lab = new JLabel("General Infomation: ");
				lab.setForeground(Color.BLUE);
				lab.setFont(new Font("Times", Font.BOLD, 16));
				
				JPanel notes = new JPanel();
				notes.setLayout(new BorderLayout(10,10));
				JTextArea note =new JTextArea(3,5);
				note.setLineWrap(true);
				notes.setBounds(0,0,100,20);
				notes.add(new JLabel("Notes: "), BorderLayout.NORTH);
				notes.add(note,BorderLayout.CENTER);
				
				center.add(lab, BorderLayout.NORTH);
				center.add(inputs, BorderLayout.CENTER);
				center.add(notes,BorderLayout.SOUTH);
				
				
				//Add two panels to the main panel
				p.setLayout(new BorderLayout(10,10));
				//add(date, BorderLayout.NORTH);
				p.add(center, BorderLayout.CENTER);
				p.add(tPanel, BorderLayout.SOUTH);
			return p;
	}
	
	public void input(){
		JRadioButton client = new JRadioButton("To Client");
		client.setFont(new Font("Times", Font.BOLD, 15));
		client.setSelected(true);
		JRadioButton vendor = new JRadioButton("From Vendor");
		vendor.setFont(new Font("Times", Font.BOLD, 15));
		ButtonGroup group = new ButtonGroup();
		group.add(client);
		group.add(vendor);
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(client);
		buttonPanel.add(vendor);
		int kind = JOptionPane.showConfirmDialog(null, buttonPanel, "Add Invoice", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
		
		if (kind == JOptionPane.OK_OPTION){
			JPanel pane = null;
			if (client.isSelected()){
				pane=add(2);
				
			}
			else{
				pane=add(1);
			}
			JOptionPane option = new JOptionPane();
			int input = option.showConfirmDialog(null, pane, "Add Invoice", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
			if (input == JOptionPane.OK_OPTION) {
			    System.out.println("Successfully Add An Invoice");
			} else {
			    System.out.println("Canceled");
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}
