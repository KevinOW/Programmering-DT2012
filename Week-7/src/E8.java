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

    JFrame f = new JFrame("E8");
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
