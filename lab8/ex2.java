package lab8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex2 {
    private static JFrame frame;
    private static CardLayout cardLayout;
    private static JPanel cardPanel;

    public static void main(String[] args) {
        frame = new JFrame("GUI Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Create three pages
        JPanel page1 = new JPanel();
        JLabel label1 = new JLabel("Page 1");
        page1.add(label1);

        JPanel page2 = new JPanel();
        JLabel label2 = new JLabel("Page 2");
        page2.add(label2);

        JPanel page3 = new JPanel();
        JLabel label3 = new JLabel("Page 3");
        page3.add(label3);

        // Add pages to the card panel
        cardPanel.add(page1, "Page 1");
        cardPanel.add(page2, "Page 2");
        cardPanel.add(page3, "Page 3");

        // Create navigation buttons
        JButton prevButton = new JButton("Prev");
        JButton nextButton = new JButton("Next");
        JButton exitButton = new JButton("Exit");

        // Add action listeners to the buttons
        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.previous(cardPanel);
            }
        });

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(cardPanel);
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(prevButton);
        buttonPanel.add(nextButton);
        buttonPanel.add(exitButton);

        // Add the card panel and button panel to the frame
        frame.add(cardPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Show the frame
        frame.pack();
        frame.setVisible(true);

    }
}
