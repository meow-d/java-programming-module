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

        JTextField num1Field = new JTextField(10);
        JTextField num2Field = new JTextField(10);
        JButton sumButton = new JButton("Sum");
        JTextField resultField = new JTextField(10);
        resultField.setEditable(false);

        JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel1.add(new JLabel("Number 1:"));
        panel1.add(num1Field);
        panel.add(panel1);

        JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel2.add(new JLabel("Number 2:"));
        panel2.add(num2Field);
        panel.add(panel2);

        JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel3.add(sumButton);
        panel.add(panel3);

        JPanel panel4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel4.add(new JLabel("Sum:"));
        panel4.add(resultField);
        panel.add(panel4);

        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    int sum = num1 + num2;
                    resultField.setText(Integer.toString(sum));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid input! Please enter valid numbers.");
                }
            }
        });

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
