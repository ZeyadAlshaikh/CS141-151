import javax.swing.*;


import java.awt.*;
import java.awt.event.*;

public class GUIDemo  extends JFrame implements ActionListener{

    private JPanel pnl1 = new JPanel(new FlowLayout());
    private JButton btn1 = new JButton("Button 1");
    private JTextField txt1 = new JTextField(10);

    private JPanel pnl2 = new JPanel(new FlowLayout());
    private JButton btn2 = new JButton("Button 2");
    private JTextField txt2 = new JTextField(10);

    public GUIDemo(){

        setLayout(new FlowLayout());
       

        setTitle("GUI Demo");
        setVisible(true);
        setSize(300,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn1.addActionListener(this);
        pnl1.add(btn1);
        pnl1.add(txt1);
        add(pnl1);

        btn2.addActionListener(this);
        pnl2.add(btn2);
        pnl2.add(txt2);
        add(pnl2);

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        System.out.println();
        if(e.getActionCommand() == btn1.getActionCommand()){
            txt1.setText("Button 1");
        }else if(e.getActionCommand() == btn2.getActionCommand()){
            txt2.setText("Button 2");
        }
        
    }




}


