/*
  This is the fourth exercise

  Complete the data type DiceController by modifying the class
  CounterController we presented in the lecture.

    - Make sure it uses a DiceModel and a DiceView instead of a
      CounterModel and a CounterView.
*/

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DiceController implements ActionListener{

  private DiceModel dm;
  private DiceView dv;

  public DiceController(DiceModel cm, DiceView cv) {
    this.dm = cm;
    this.dv = cv;
  }

  public void actionPerformed(ActionEvent e){
    dm.roll();
    dv.repaint();
  }

}
