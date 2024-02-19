package lab8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex1 {
    private static JButton watermelon, pineapple, apple, orange;

    public static ActionListener createButtonListener() {
        return new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton source = (JButton) e.getSource();
                JOptionPane.showMessageDialog(null, source.getText() + " was clicked!");
            }
        };
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Fruit selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(new FlowLayout());

        frame.add(watermelon = new JButton("watermelon"));
        frame.add(pineapple = new JButton("pineapple"));
        frame.add(apple = new JButton("apple"));
        frame.add(orange = new JButton("orange"));

        ActionListener listener = createButtonListener();
        watermelon.addActionListener(listener);
        pineapple.addActionListener(listener);
        apple.addActionListener(listener);
        orange.addActionListener(listener);

        frame.setVisible(true);
    }
}
