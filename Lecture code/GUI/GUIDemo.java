
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

public class GUIDemo  extends JFrame implements ActionListener{

    private JLabel lbl1 = new JLabel("lable 1");
    private JTextField txtF1  = new JTextField( 20); 

    private JButton btn1 = new JButton("Button 1"); 
    private JButton btn2 = new JButton("Button 2"); 
    private JButton btn3 = new JButton("Button 3"); 

    private JPanel pnl1 = new JPanel();
    private JPanel pnl2 = new JPanel();

    public GUIDemo(){
        // step 1
        setLayout(new FlowLayout());
       

        pnl1.setLayout(new FlowLayout());
        pnl1.add(lbl1);
        pnl1.add(txtF1);
        add(pnl1);

        pnl2.setLayout(new FlowLayout());
        pnl2.add(btn1);
        btn1.addActionListener(this);
        pnl2.add(btn2);
        btn2.addActionListener(this);
        pnl2.add(btn3);
        btn3.addActionListener(this);
        add(pnl2);

        setTitle("GUI Demo");
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        txtF1.setText(((JButton)e.getSource()).getText());

        
    }

    public static void main(String[] args) {
        GUIDemo gui = new GUIDemo();
    }



   
    
    
}
