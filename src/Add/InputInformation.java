package Add;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public abstract class InputInformation extends JPanel{
	public JPanel add(){
		return null;}
	
	public JPanel add(int a){
		return null;
	}
	
	public InputInformation(){
		
	}
	
	public void input(String s, JPanel panel){
		JOptionPane option = new JOptionPane();
		int input = option.showConfirmDialog(null, panel, s, JOptionPane.OK_CANCEL_OPTION);
		if (input == JOptionPane.OK_OPTION) {
		    System.out.println("Successfully Add A Contact");
		} else {
		    System.out.println("Canceled");
		}
	}
}
