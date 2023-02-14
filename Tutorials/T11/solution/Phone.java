import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Phone extends JFrame implements ActionListener{
	private JTextField result = new JTextField("", 16);
	
	private JPanel panelResult = new JPanel();
	private JPanel panelButtons = new JPanel(new GridLayout(4,3));
	
	private String buttonNames = "123456789*0#";
	private String callNumber = "";
	
	public Phone () {
		panelResult.add(result);
		
		for(int i = 0; i < buttonNames.length(); i++) {
			JButton b = new JButton(""+buttonNames.charAt(i));
			b.addActionListener(this);
			panelButtons.add(b);
		}
		
		add(panelResult, BorderLayout.NORTH);
		add(panelButtons, BorderLayout.CENTER);
		
		setSize(200,150);
		setTitle("Phone");
		setVisible(true);
		
	}

	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		callNumber += b.getText();
		String formattedCallNumber = "";
		if (callNumber.length() <= 3)
			formattedCallNumber = callNumber;
		else if (callNumber.length() <= 7)
			formattedCallNumber = callNumber.substring(0,3) + "-" + callNumber.substring(3);
		else if (callNumber.length() <= 10)
			formattedCallNumber = "(" + callNumber.substring(0,3) + ") " + callNumber.substring(3,6) + "-" + callNumber.substring(6);		
		else
			formattedCallNumber = "+" + callNumber.substring(0,1) + "-" + callNumber.substring(1,4) + "-" + callNumber.substring(4,7) +"-"+ callNumber.substring(7);	
				
		result.setText(formattedCallNumber);
	}	
	
	public static void main(String[] args){
		new Phone();
	}
}
