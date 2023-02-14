import javax.swing.*;

public class Counter extends JFrame {

  private JLabel jLabel = new JLabel("Counter");
  private JTextField jTextField = new JTextField("18");
  private JButton jButton = new JButton("Count");
  private JPanel jPanel = new JPanel();

  public Counter() {

    setLayout(new java.awt.FlowLayout());

    jPanel.setLayout(new java.awt.FlowLayout());
    jPanel.add(jLabel);
    jPanel.add(jTextField);
    jPanel.add(jButton);

    add(jPanel);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("AWTCounter");
    setSize(220, 70);
    setVisible(true);

  }

  public static void main(String[] args) {

    Counter counter = new Counter();

  }
}
