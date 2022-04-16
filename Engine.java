package CalcVersion1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Engine implements ActionListener {

    Main parent;
    char action = ' ';
    double currentResult = 0;

    Engine(Main parent) {
        this.parent = parent;
    }

    public void actionPerformed(ActionEvent e) {
        JButton klickBtn = (JButton) e.getSource();
        String klickBtnValue = klickBtn.getText();
        String screenValue = parent.screen.getText();
        parent.screen.setText(screenValue + klickBtnValue);

        double displayValue = 0;
        if (!"".equals(screenValue)) {
            displayValue = Double.parseDouble(screenValue);
        }

        Object source = e.getSource();

        if(source==parent.clear){
            parent.screen.setText("");
        } else if (source==parent.point){
            parent.screen.setText(screenValue+".");
        } else if (source == parent.plus){
            action = '+';
            currentResult = displayValue;
            parent.screen.setText("");
        } else if (source == parent.minus) {
            action = '-';
            currentResult = displayValue;
            parent.screen.setText("");
        } else if (source == parent.multiply) {
            action = '*';
            currentResult = displayValue;
            parent.screen.setText("");
        } else if (source == parent.divide) {
            action = '/';
            currentResult = displayValue;
            parent.screen.setText("");
        } else if (source == parent.equal) {
            if (action == '+') {
                currentResult += displayValue;
                parent.screen.setText("" + currentResult);
            } else if (action == '-') {
                currentResult -= displayValue;
                parent.screen.setText("" + currentResult);
            } else if (action == '*') {
                currentResult *= displayValue;
                parent.screen.setText("" + currentResult);
            } else if (action == '/') {
                if (displayValue == 0) {
                    parent.screen.setText("");
                    JOptionPane.showMessageDialog(null, "Cannot be divided by zero", "some mistake", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    currentResult /= displayValue;
                    parent.screen.setText("" + currentResult);
                }
            }else {
                parent.screen.setText("");
            }
        }
    }
}
