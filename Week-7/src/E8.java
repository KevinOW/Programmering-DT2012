/*
  This is exercise 8.

  Copy the code from E5.java and modify the code so that
  it works with DiceView2 and DiceController2.

*/

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;

public class E8{
  public static void main(String[] cmdLn){
    DiceModel model = new DiceModel();
    DiceView2 dv = new DiceView2(model);
    DiceController2 controller = new DiceController2(model, dv);

    JFrame frame = new JFrame("E8");
    frame.setLayout(new BorderLayout());
    frame.add(dv, BorderLayout.CENTER);
    JButton rollButton = new JButton("ROLL");
    frame.add(rollButton, BorderLayout.SOUTH);

    rollButton.addActionListener(controller);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.pack();
    frame.setVisible(true);
  }
}
