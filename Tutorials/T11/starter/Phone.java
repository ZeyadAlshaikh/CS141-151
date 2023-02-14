import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Phone extends JFrame {
	private JTextField result = new JTextField("", 16);
	
	private JPanel panelResult = new JPanel();
	private JPanel panelButtons = new JPanel(new GridLayout(4,3));
	
	private String buttonNames = "123456789*0#";
	
	public Phone () {
		panelResult.add(result);
		
		for(int i = 0; i < buttonNames.length(); i++) {
			JButton b = new JButton(""+buttonNames.charAt(i));
			panelButtons.add(b);
		}
		
		add(panelResult, BorderLayout.NORTH);
		add(panelButtons, BorderLayout.CENTER);
		
		setSize(200,150);
		setTitle("Phone");
		setVisible(true);
		
	}
	
	public static void main(String[] args){
		new Phone();
	}
}
