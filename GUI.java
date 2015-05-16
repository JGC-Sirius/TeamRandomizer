import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class GUI extends JFrame {
  // Komponenten für beide Modi
  private JRadioButton jRadioButton1 = new JRadioButton();
  private JRadioButton jRadioButton2 = new JRadioButton();
  private JRadioButton jRadioButton3 = new JRadioButton();
  private JRadioButton jRadioButton4 = new JRadioButton();
  private JRadioButton jRadioButton5 = new JRadioButton();
  private ButtonGroup buttonGroup1 = new ButtonGroup();
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();
  private JButton jButton1 = new JButton();
  
  // Komponenten für Eingabe-Modus
  private JTextField jTextField1 = new JTextField();
  private JTextField jTextField2 = new JTextField();
  private JTextField jTextField3 = new JTextField();
  private JTextField jTextField4 = new JTextField();
  private JTextField jTextField5 = new JTextField();
  private JTextField jTextField6 = new JTextField();
  private JTextField jTextField7 = new JTextField();
  private JTextField jTextField8 = new JTextField();
  private JTextField jTextField9 = new JTextField();
  private JTextField jTextField10 = new JTextField();
  
  // Komponenten für Ausgabe-Modus
  private JLabel jLabel3 = new JLabel();
  private JLabel jLabel4 = new JLabel();
  private JLabel jLabel5 = new JLabel();
  private JLabel jLabel6 = new JLabel();
  private JLabel jLabel7 = new JLabel();
  private JLabel jLabel8 = new JLabel();
  private JLabel jLabel9 = new JLabel();
  private JLabel jLabel10 = new JLabel();
  private JLabel jLabel11 = new JLabel();
  private JLabel jLabel12 = new JLabel();
  private JLabel jLabel13 = new JLabel();
  private JLabel jLabel14 = new JLabel();
  
  // Kontrollvariablen
  private String mode = "Next Action: Randomize";
  private int n = 10;
  private String[] randomizedList;
  
  // Logik-Ebene
  private TeamRandomizer tr;
  
  public GUI(String title) {
    super(title);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 434; 
    int frameHeight = 434;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    
    jRadioButton1.setBounds(24, 32, 25, 25);
    jRadioButton1.setText("");
    jRadioButton1.setOpaque(false);
    jRadioButton1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        jTextField1.setVisible(true);
        jTextField2.setVisible(true);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
        jTextField6.setVisible(false);
        jTextField7.setVisible(false);
        jTextField8.setVisible(false);
        jTextField9.setVisible(false);
        jTextField10.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        n = 2;
        mode = "Next Action: Randomize";
        jButton1.setText("Einteilen");
      }
    });
    cp.add(jRadioButton1);
    jRadioButton2.setBounds(56, 32, 25, 25);
    jRadioButton2.setText("");
    jRadioButton2.setOpaque(false);
    jRadioButton2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        jTextField1.setVisible(true);
        jTextField2.setVisible(true);
        jTextField3.setVisible(true);
        jTextField4.setVisible(true);
        jTextField5.setVisible(false);
        jTextField6.setVisible(false);
        jTextField7.setVisible(false);
        jTextField8.setVisible(false);
        jTextField9.setVisible(false);
        jTextField10.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        n = 4;
        mode = "Next Action: Randomize";
        jButton1.setText("Einteilen");
      }
    });
    cp.add(jRadioButton2);
    jRadioButton3.setBounds(88, 32, 25, 25);
    jRadioButton3.setText("");
    jRadioButton3.setOpaque(false);
    jRadioButton3.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        jTextField1.setVisible(true);
        jTextField2.setVisible(true);
        jTextField3.setVisible(true);
        jTextField4.setVisible(true);
        jTextField5.setVisible(true);
        jTextField6.setVisible(true);
        jTextField7.setVisible(false);
        jTextField8.setVisible(false);
        jTextField9.setVisible(false);
        jTextField10.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        n = 6;
        mode = "Next Action: Randomize";
        jButton1.setText("Einteilen");
      }
    });
    cp.add(jRadioButton3);
    jRadioButton4.setBounds(120, 32, 25, 25);
    jRadioButton4.setText("");
    jRadioButton4.setOpaque(false);
    jRadioButton4.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        jTextField1.setVisible(true);
        jTextField2.setVisible(true);
        jTextField3.setVisible(true);
        jTextField4.setVisible(true);
        jTextField5.setVisible(true);
        jTextField6.setVisible(true);
        jTextField7.setVisible(true);
        jTextField8.setVisible(true);
        jTextField9.setVisible(false);
        jTextField10.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        n = 8;
        mode = "Next Action: Randomize";
        jButton1.setText("Einteilen");
      }
    });
    cp.add(jRadioButton4);
    jRadioButton5.setBounds(152, 32, 25, 25);
    jRadioButton5.setText("");
    jRadioButton5.setOpaque(false);
    jRadioButton5.setSelected(true);
    jRadioButton5.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        jTextField1.setVisible(true);
        jTextField2.setVisible(true);
        jTextField3.setVisible(true);
        jTextField4.setVisible(true);
        jTextField5.setVisible(true);
        jTextField6.setVisible(true);
        jTextField7.setVisible(true);
        jTextField8.setVisible(true);
        jTextField9.setVisible(true);
        jTextField10.setVisible(true);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        n = 10;
        mode = "Next Action: Randomize";
        jButton1.setText("Einteilen");
      }
    });
    cp.add(jRadioButton5);
    buttonGroup1.add(jRadioButton1);
    buttonGroup1.add(jRadioButton2);
    buttonGroup1.add(jRadioButton3);
    buttonGroup1.add(jRadioButton4);
    buttonGroup1.add(jRadioButton5);
    jLabel1.setBounds(16, 8, 179, 25);
    jLabel1.setText("Anzahl der Spieler pro Team");
    cp.add(jLabel1);
    jLabel2.setBounds(32, 48, 211, 33);
    jLabel2.setText("1        2        3         4        5");
    cp.add(jLabel2);
    setTitle("League Team Randomizer by Sirius (Release 1)");
    jButton1.setBounds(200, 8, 209, 65);
    jButton1.setText("Einteilen");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jTextField1.setBounds(16, 80, 393, 25);
    jTextField1.setText("Spieler 1");
    jTextField1.setHorizontalAlignment((int) JTextField.CENTER_ALIGNMENT);
    cp.add(jTextField1);
    jTextField2.setBounds(16, 112, 393, 25);
    jTextField2.setText("Spieler 2");
    jTextField2.setHorizontalAlignment((int) JTextField.CENTER_ALIGNMENT);
    cp.add(jTextField2);
    jTextField3.setBounds(16, 144, 393, 25);
    jTextField3.setText("Spieler 3");
    jTextField3.setHorizontalAlignment((int) JTextField.CENTER_ALIGNMENT);
    cp.add(jTextField3);
    jTextField4.setBounds(16, 176, 393, 25);
    jTextField4.setText("Spieler 4");
    jTextField4.setHorizontalAlignment((int) JTextField.CENTER_ALIGNMENT);
    cp.add(jTextField4);
    jTextField5.setBounds(16, 208, 393, 25);
    jTextField5.setText("Spieler 5");
    jTextField5.setHorizontalAlignment((int) JTextField.CENTER_ALIGNMENT);
    cp.add(jTextField5);
    jTextField6.setBounds(16, 240, 393, 25);
    jTextField6.setText("Spieler 6");
    jTextField6.setHorizontalAlignment((int) JTextField.CENTER_ALIGNMENT);
    cp.add(jTextField6);
    jTextField7.setBounds(16, 272, 393, 25);
    jTextField7.setText("Spieler 7");
    jTextField7.setHorizontalAlignment((int) JTextField.CENTER_ALIGNMENT);
    cp.add(jTextField7);
    jTextField8.setBounds(16, 304, 393, 25);
    jTextField8.setText("Spieler 8");
    jTextField8.setHorizontalAlignment((int) JTextField.CENTER_ALIGNMENT);
    cp.add(jTextField8);
    jTextField9.setBounds(16, 336, 393, 25);
    jTextField9.setText("Spieler 9");
    jTextField9.setHorizontalAlignment((int) JTextField.CENTER_ALIGNMENT);
    cp.add(jTextField9);
    jTextField10.setBounds(16, 368, 393, 25);
    jTextField10.setText("Spieler 10");
    jTextField10.setHorizontalAlignment((int) JTextField.CENTER_ALIGNMENT);
    cp.add(jTextField10);
    
    jLabel3.setBounds(60, 100, 179, 25);
    jLabel3.setText("BLUE TEAM");
    jLabel3.setVisible(false);
    cp.add(jLabel3);
    
    jLabel4.setBounds(290, 100, 179, 25);
    jLabel4.setText("RED TEAM");
    jLabel4.setVisible(false);
    cp.add(jLabel4);
    
    jLabel5.setBounds(60, 150, 179, 25);
    jLabel5.setVisible(false);
    cp.add(jLabel5);
    
    jLabel6.setBounds(60, 200, 179, 25);
    jLabel6.setVisible(false);
    cp.add(jLabel6);
    
    jLabel7.setBounds(60, 250, 179, 25);
    jLabel7.setVisible(false);
    cp.add(jLabel7);
    
    jLabel8.setBounds(60, 300, 179, 25);
    jLabel8.setVisible(false);
    cp.add(jLabel8);
    
    jLabel9.setBounds(60, 350, 179, 25);
    jLabel9.setVisible(false);
    cp.add(jLabel9);
    
    jLabel10.setBounds(290, 150, 179, 25);
    jLabel10.setVisible(false);
    cp.add(jLabel10);
    
    jLabel11.setBounds(290, 200, 179, 25);
    jLabel11.setVisible(false);
    cp.add(jLabel11);
    
    jLabel12.setBounds(290, 250, 179, 25);
    jLabel12.setVisible(false);
    cp.add(jLabel12);
    
    jLabel13.setBounds(290, 300, 179, 25);
    jLabel13.setVisible(false);
    cp.add(jLabel13);
    
    jLabel14.setBounds(290, 350, 179, 25);
    jLabel14.setVisible(false);
    cp.add(jLabel14);
    
    setVisible(true);
  }
  
  public String buttonGroup1_getSelectedRadioButtonLabel() {
    for (java.util.Enumeration<AbstractButton> e = buttonGroup1.getElements(); e.hasMoreElements();) {
      AbstractButton b = e.nextElement();
      if (b.isSelected()) return b.getText();
    }
    return "";
  }
  
  public void jButton1_ActionPerformed(ActionEvent evt) {    
    if (mode.equals("Next Action: Randomize")) {
      String[] players = new String[n];
      if (n == 2) {
        players[0] = jTextField1.getText();
        players[1] = jTextField2.getText();
      }
      else if (n == 4) {
        players[0] = jTextField1.getText();
        players[1] = jTextField2.getText();
        players[2] = jTextField3.getText();
        players[3] = jTextField4.getText();
      }
      else if (n == 6) {
        players[0] = jTextField1.getText();
        players[1] = jTextField2.getText();
        players[2] = jTextField3.getText();
        players[3] = jTextField4.getText();
        players[4] = jTextField5.getText();
        players[5] = jTextField6.getText();
      }
      else if (n == 8) {
        players[0] = jTextField1.getText();
        players[1] = jTextField2.getText();
        players[2] = jTextField3.getText();
        players[3] = jTextField4.getText();
        players[4] = jTextField5.getText();
        players[5] = jTextField6.getText();
        players[6] = jTextField7.getText();
        players[7] = jTextField8.getText();
      }
      else if (n == 10) {
        players[0] = jTextField1.getText();
        players[1] = jTextField2.getText();
        players[2] = jTextField3.getText();
        players[3] = jTextField4.getText();
        players[4] = jTextField5.getText();
        players[5] = jTextField6.getText();
        players[6] = jTextField7.getText();
        players[7] = jTextField8.getText();
        players[8] = jTextField9.getText();
        players[9] = jTextField10.getText();
      }
      
      tr = new TeamRandomizer();
      
      jTextField1.setVisible(false);
      jTextField2.setVisible(false);
      jTextField3.setVisible(false);
      jTextField4.setVisible(false);
      jTextField5.setVisible(false);
      jTextField6.setVisible(false);
      jTextField7.setVisible(false);
      jTextField8.setVisible(false);
      jTextField9.setVisible(false);
      jTextField10.setVisible(false);
      
      randomizedList = tr.randomizeOrder(players);
      
      if (n == 2) {
        jLabel5.setText(randomizedList[0]);
        jLabel6.setText("");
        jLabel7.setText("");
        jLabel8.setText("");
        jLabel9.setText("");
        jLabel10.setText(randomizedList[1]);
        jLabel11.setText("");
        jLabel12.setText("");
        jLabel13.setText("");
        jLabel14.setText("");
      }
      else if (n == 4) {
        jLabel5.setText(randomizedList[0]);
        jLabel6.setText(randomizedList[1]);
        jLabel7.setText("");
        jLabel8.setText("");
        jLabel9.setText("");
        jLabel10.setText(randomizedList[2]);
        jLabel11.setText(randomizedList[3]);
        jLabel12.setText("");
        jLabel13.setText("");
        jLabel14.setText("");
      }
      else if (n == 6) {
        jLabel5.setText(randomizedList[0]);
        jLabel6.setText(randomizedList[1]);
        jLabel7.setText(randomizedList[2]);
        jLabel8.setText("");
        jLabel9.setText("");
        jLabel10.setText(randomizedList[3]);
        jLabel11.setText(randomizedList[4]);
        jLabel12.setText(randomizedList[5]);
        jLabel13.setText("");
        jLabel14.setText("");
      }
      else if (n == 8) {
        jLabel5.setText(randomizedList[0]);
        jLabel6.setText(randomizedList[1]);
        jLabel7.setText(randomizedList[2]);
        jLabel8.setText(randomizedList[3]);
        jLabel9.setText("");
        jLabel10.setText(randomizedList[4]);
        jLabel11.setText(randomizedList[5]);
        jLabel12.setText(randomizedList[6]);
        jLabel13.setText(randomizedList[7]);
        jLabel14.setText("");
      }
      else if (n == 10) {
        jLabel5.setText(randomizedList[0]);
        jLabel6.setText(randomizedList[1]);
        jLabel7.setText(randomizedList[2]);
        jLabel8.setText(randomizedList[3]);
        jLabel9.setText(randomizedList[4]);
        jLabel10.setText(randomizedList[5]);
        jLabel11.setText(randomizedList[6]);
        jLabel12.setText(randomizedList[7]);
        jLabel13.setText(randomizedList[8]);
        jLabel14.setText(randomizedList[9]);
      }
      
      jLabel3.setVisible(true);
      jLabel4.setVisible(true);
      jLabel5.setVisible(true);
      jLabel6.setVisible(true);
      jLabel7.setVisible(true);
      jLabel8.setVisible(true);
      jLabel9.setVisible(true);
      jLabel10.setVisible(true);
      jLabel11.setVisible(true);
      jLabel12.setVisible(true);
      jLabel13.setVisible(true);
      jLabel14.setVisible(true);
      
      mode = "Next Action: List Players";
      jButton1.setText("Bearbeiten");
    }
    else {
      jLabel3.setVisible(false);
      jLabel4.setVisible(false);
      jLabel5.setVisible(false);
      jLabel6.setVisible(false);
      jLabel7.setVisible(false);
      jLabel8.setVisible(false);
      jLabel9.setVisible(false);
      jLabel10.setVisible(false);
      jLabel11.setVisible(false);
      jLabel12.setVisible(false);
      jLabel13.setVisible(false);
      jLabel14.setVisible(false);
      
      jTextField1.setVisible(true);
      jTextField2.setVisible(true);
      if (n >= 4) {
        jTextField3.setVisible(true);
        jTextField4.setVisible(true);
      }
      if (n >= 6) {
        jTextField5.setVisible(true);
        jTextField6.setVisible(true);
      }
      if (n >= 8) {
        jTextField7.setVisible(true);
        jTextField8.setVisible(true);
      }
      if (n >= 10) {
        jTextField9.setVisible(true);
        jTextField10.setVisible(true);
      }      
      mode = "Next Action: Randomize";
      jButton1.setText("Einteilen");
    }
  }
  
  public static void main(String[] args) {
    new GUI("GUI");
  }
}