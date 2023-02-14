import javax.swing.*;

public class Authenticator extends JFrame {

  private JLabel userNameLbl = new JLabel("User Name");
  private JLabel passwordLbl = new JLabel("Password");

  private JTextField userNameTf = new JTextField(10);
  private JTextField passwordTf = new JTextField(10);

  private JButton jButton = new JButton("Login");

  private JPanel jPanel1 = new JPanel();
  private JPanel jPanel2 = new JPanel();
  private JPanel jPanel3 = new JPanel();

  public Authenticator() {

    setLayout(new java.awt.FlowLayout());

    jPanel1.setLayout(new java.awt.FlowLayout());
    jPanel1.add(userNameLbl);
    jPanel1.add(userNameTf);
    add(jPanel1);

    jPanel2.setLayout(new java.awt.FlowLayout());
    jPanel2.add(passwordLbl);
    jPanel2.add(passwordTf);
    add(jPanel2);

    jPanel3.setLayout(new java.awt.FlowLayout());
    jPanel3.add(jButton);
    add(jPanel3);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Authenticator");
    setSize(300, 150);
    setVisible(true);

  }

  public static void main(String[] args) {

    Authenticator authenticator = new Authenticator();

  }
}
