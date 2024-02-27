package lab8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel1.add(new JLabel("Number 1:"));
        JTextField num1Field = new JTextField(10);
        panel1.add(num1Field);
        panel.add(panel1);

        JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel2.add(new JLabel("Number 2:"));
        JTextField num2Field = new JTextField(10);
        panel2.add(num2Field);
        panel.add(panel2);

        JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton sumButton = new JButton("+");
        JButton minusButton = new JButton("-");
        JButton multiplyButton = new JButton("*");
        JButton divideButton = new JButton("/");
        panel3.add(sumButton);
        panel3.add(minusButton);
        panel3.add(multiplyButton);
        panel3.add(divideButton);
        panel.add(panel3);

        JPanel panel4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel4.add(new JLabel("Sum:"));
        JTextField resultField = new JTextField(10);
        resultField.setEditable(false);
        panel4.add(resultField);
        panel.add(panel4);

        sumButton.addActionListener(createOperationActionListener("+", num1Field, num2Field, resultField, frame));
        minusButton.addActionListener(createOperationActionListener("-", num1Field, num2Field, resultField, frame));
        multiplyButton.addActionListener(createOperationActionListener("*", num1Field, num2Field, resultField, frame));
        divideButton.addActionListener(createOperationActionListener("/", num1Field, num2Field, resultField, frame));

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static ActionListener createOperationActionListener(String operation, JTextField num1Field,
            JTextField num2Field, JTextField resultField, JFrame frame) {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    int result = 0;

                    switch (operation) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            result = num1 / num2;
                            break;
                    }

                    resultField.setText(Integer.toString(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid input! Please enter valid numbers.");
                }
            }
        };
    }
}
