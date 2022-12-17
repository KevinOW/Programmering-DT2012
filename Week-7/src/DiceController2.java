/*
  This is exercise 7.

  Copy the code from DiceController.java and modify the code so that
  it works with DiceView2 instead of DiceView.

*/

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DiceController2 implements ActionListener{

  private DiceModel dm;
  private DiceView2 dv;

  public DiceController2(DiceModel cm, DiceView2 cv) {
    this.dm = cm;
    this.dv = cv;
  }

  public void actionPerformed(ActionEvent e){
    dm.roll();
    dv.repaint();
  }
}

