import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.BorderLayout;
import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Bonus extends JFrame {
    private JLabel[] diceLabels;
    private JLabel messageLabel;

    public Bonus() {
        JPanel dicePanel = new JPanel();
        dicePanel.setLayout(new FlowLayout());
        diceLabels = new JLabel[5];
        Border b = BorderFactory.createEtchedBorder();
        Border tb = BorderFactory.createTitledBorder(b, "Your dice");

        for (int i = 0; i < 5; i++) {
            diceLabels[i] = new JLabel();
            diceLabels[i].setOpaque(true);
            diceLabels[i].setBackground(new Color(0,100,0));
            diceLabels[i].setBorder(tb);
            dicePanel.add(diceLabels[i]);
        }
        JButton rollButton = new JButton("Roll");
        rollButton.addActionListener(new RollButtonListener());
        messageLabel = new JLabel();
        Border mes = BorderFactory.createEtchedBorder();
        Border mesB = BorderFactory.createTitledBorder(mes, "Outcome");
        messageLabel.setBorder(mesB);
        int[] rolls = rollDice();
        updateDiceLabels(rolls);
        updateMessageLabel(rolls);
        messageLabel.setFont(new Font(Font.SERIF,Font.ITALIC,56));
        add(dicePanel, BorderLayout.CENTER);
        add(rollButton, BorderLayout.SOUTH);
        add(messageLabel, BorderLayout.NORTH);
    }

    private class RollButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int[] rolls = rollDice();
            updateDiceLabels(rolls);
            updateMessageLabel(rolls);
        }
    }
    private int[] rollDice() {
        int[] rolls = new int[5];
        for (int i = 0; i < 5; i++) {
            DiceModel d = new DiceModel();
            rolls[i] = d.read();
        }
        return rolls;
    }
    private void updateDiceLabels(int[] rolls) {
        for (int i = 0; i < 5; i++) {
            diceLabels[i].setIcon(new ImageIcon("dice" + rolls[i] + ".gif"));
        }
    }
    private void updateMessageLabel(int[] rolls) {
        if (rolls[0] % 2 == 0 && rolls[1] % 2 == 0 && rolls[2] % 2 == 0 && rolls[3] % 2 == 0 && rolls[4] % 2 == 0) {
            messageLabel.setText("Even");
        } else if (rolls[0] % 2 == 1 && rolls[1] % 2 == 1 && rolls[2] % 2 == 1 && rolls[3] % 2 == 1 && rolls[4] % 2 == 1) {
            messageLabel.setText("Odds");
        } else {
            messageLabel.setText("No Luck!");
        }
    }
    public static void main(String[] args) {
        Bonus f = new Bonus();
        f.setVisible(true);
        f.setTitle("Odds or Even");
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}