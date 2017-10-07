// Nastassja Motro 9/18/17

//Import Layout, Listeners and Controls
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

// Class Name
public class Tanker {
  // Controls for App
  private JFrame mainFrame;
  private JLabel headerLabel;
  private JLabel statusLabel;
  private JPanel controlPanel;
  private JPanel buttonPanel;
  private JButton calculate;
  
  private JTextField ouncesEntry, yearsEntry, nameEntry, ageEntry;
  
  //Constructor
  public Tanker() {
    prepareGUI();
  }
  
  // Entry Point
  public static void main(String[] args) {
    Tanker swingTanker = new Tanker();
    swingTanker.showTextField();
  }
  
  // Setup the GUI Environment
  private void prepareGUI() {
    // Setup App Frame
    mainFrame = new JFrame("Tanker Truck Calc 2.0");
    mainFrame.setSize(600, 400);
    mainFrame.setLayout(new GridLayout(4, 1));
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    buttonPanel = new JPanel();
    
    // Setup Labels
    headerLabel = new JLabel("Welcome to another Tanker Truck Calculator", JLabel.CENTER);
    statusLabel = new JLabel("By Nastassja Motro    4A", JLabel.CENTER);
    statusLabel.setSize(150, 150);
    nameEntry = new JTextField(4);
    ageEntry = new JTextField(4);
    ouncesEntry = new JTextField(4);
    yearsEntry = new JTextField(4);
    
    JLabel nameText = new JLabel("Your name: ");
    
    JLabel ageText = new JLabel("Year you were born: ");
    
    JLabel ounceText = new JLabel("Ounces drank per day: ");
    
    JLabel yearsText = new JLabel("Estimated Lifespan: ");
    
    // Setup Layout
    mainFrame.setLayout(new GridLayout(5, 1));
    calculate = new JButton("calculate");
    
    // Add Interactables
    controlPanel = new JPanel();
    controlPanel.add(nameText);
    controlPanel.add(nameEntry);
    controlPanel.add(ageText);
    controlPanel.add(ageEntry);
    controlPanel.add(ounceText);
    controlPanel.add(ouncesEntry);
    controlPanel.add(yearsText);
    controlPanel.add(yearsEntry);
    buttonPanel.add(calculate);
  }
  
  // Display Controls
  private void showTextField() {
    // Set Values for Controls
    
    // Action Listner for Button Click
    calculate.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEven ae) {
        float name = (float) Float.valueOf(nameEntry.getText());
        float age = (float) Float.valueOf(ageEntry.getText());
        float ounces = (float) Float.valueOf(ouncesEntry.getText());
        float years = (float) Float.valueOf(yearsEntry.getTExt());
        ounces *= 365;
        ounces *= years;
        ounces /= 128;
        ounces /= 8000;
        2017 -= age;
        statusLabel.setText("So " + name + " who is " + age + " years old, will drink about " + ounces + " 8,000 gallon tankers of water.");
        mainFrame.setVisible(true);
      }
    });
    
    // Place Controls on Panels
    
    // Don't Forget to Set Visibility
    mainFrame.add(headerLabel);
    mainFrame.add(controlPanel);
    mainFrame.add(buttonPanel);
    mainFrame.add(statusLabel);
    mainFrame.setVisible(true);
  }
}
