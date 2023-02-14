import javax.swing.*;

public class KeyEvent extends JFrame {

  private JLabel jLabel = new JLabel("Enter Text:");
  private JTextField jTextField = new JTextField("A", 20);
  private JTextArea jTextArea = new JTextArea("You Have Typed A", 10, 40);

  private JPanel jPanel1 = new JPanel();
  private JPanel jPanel2 = new JPanel();

  public KeyEvent() {

    setLayout(new java.awt.FlowLayout());

    jPanel1.setLayout(new java.awt.FlowLayout());
    jPanel1.add(jLabel);
    jPanel1.add(jTextField);
    add(jPanel1);

    jPanel2.setLayout(new java.awt.FlowLayout());
    jPanel2.add(jTextArea);
    add(jPanel2);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("KeyEvent Demo");
    setSize(550, 280);
    setVisible(true);

  }

  public static void main(String[] args) {

    KeyEvent mouseMotion = new KeyEvent();

  }
}
