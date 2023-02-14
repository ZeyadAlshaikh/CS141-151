import javax.swing.*;
import java.awt.*;

public class MouseMotion extends JFrame {

  private JLabel jLabelXc = new JLabel("X-Click");
  private JLabel jLabelYc = new JLabel("Y-Click");
  private JLabel jLabelXp = new JLabel("X-Position");
  private JLabel jLabelYp = new JLabel("Y-Position");

  private JTextField jTextFielXc = new JTextField("252");
  private JTextField jTextFielYc = new JTextField("105");
  private JTextField jTextFielXp = new JTextField("233");
  private JTextField jTextFielYp = new JTextField("40");

  private JPanel jPanel1 = new JPanel();
  private JPanel jPanel2 = new JPanel();

  public MouseMotion() {

    setLayout(new java.awt.FlowLayout());

    jPanel1.setLayout(new java.awt.FlowLayout(FlowLayout.LEFT));
    jPanel1.add(jLabelXc);
    jPanel1.add(jTextFielXc);
    jPanel1.add(jLabelYc);
    jPanel1.add(jTextFielYc);
    add(jPanel1);

    jPanel2.setLayout(new java.awt.FlowLayout(FlowLayout.LEFT));
    jPanel2.add(jLabelXp);
    jPanel2.add(jTextFielXp);
    jPanel2.add(jLabelYp);
    jPanel2.add(jTextFielYp);
    add(jPanel2);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("MouseMotion Demo");
    setSize(320, 120);
    setVisible(true);

  }

  public static void main(String[] args) {

    MouseMotion mouseMotion = new MouseMotion();

  }
}
