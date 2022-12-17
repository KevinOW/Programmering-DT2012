import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class E1 {
  private static final String INSTR = "<html>"
      +
      "Use the button to throw the dice. <br/>"
      +
      "You see your dice in standard output."
      +
      "</html>";

  public static void main(String[] cmdLn) {
    JFrame f = new JFrame("Throwing a dice");
    f.add(new JLabel(INSTR), BorderLayout.NORTH);
    JButton btn = new JButton("ROLL");
    f.add(btn, BorderLayout.CENTER);
    f.add(btn, BorderLayout.SOUTH);
    Roller roller = new Roller();
    btn.addActionListener(roller);
    f.pack();
    f.setVisible(true);
  }
}

class Roller implements ActionListener {
  public void actionPerformed(ActionEvent e) {
    System.out.println((int) (Math.random() * 6) + 1);
  }
}