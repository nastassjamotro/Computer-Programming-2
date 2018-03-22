import javax.swing.JFrame;
//import pacman.Board;

public class Pacman extends JFrame {
  public Pacman() {
    initGUI();
  }
  
  private void initGUI() {
    add(new Board());
    
    setTitle("Pacman");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(380, 420);
    setLocationRelativeTo(null);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new Pacman();
  }
}
