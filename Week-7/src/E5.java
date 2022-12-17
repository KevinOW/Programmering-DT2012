/*

  Complete the class E5 according to the instructions in the PDF file.
*/

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class E5{
  public static void main(String[] cmdLn){
    DiceModel model = new DiceModel();
    DiceView dv = new DiceView(model);
    DiceController controller = new DiceController(model, dv);

    JFrame f = new JFrame("E5");
    f.setLayout(new BorderLayout());
    f.add(dv, BorderLayout.CENTER);
    JButton rollButton = new JButton("ROLL");
    f.add(rollButton, BorderLayout.SOUTH);

    rollButton.addActionListener(controller);

    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.pack();
    f.setVisible(true);
  }
}