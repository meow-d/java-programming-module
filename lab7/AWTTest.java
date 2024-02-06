package lab7;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTTest {
    public static void main(String[] args) {
        // create a new frame and set its properties
        Frame f = new Frame("AWT Test");
        f.setSize(1000, 1000);
        f.setTitle("my first frame");

        // create a layout manager and set it to the frame
        // though you don't need to name the manager since you're only using it once
        // options: BorderLayout, FlowLayout, GridLayout, CardLayout, GridBagLayout
        // example: f.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        // this floats to the left, with 10px horizontal and 10px vertical gaps
        f.setLayout(new GridLayout(1, 2, 10, 10));
        // this creates a 1x2 grid with 10px horizontal and 10px vertical gaps

        // panels are containers that can hold components
        Panel buttonPanel = new Panel();
        buttonPanel.setBackground(Color.blue);
        buttonPanel.setLayout(new FlowLayout());
        Panel textPanel = new Panel();
        textPanel.setBackground(Color.red);
        textPanel.setLayout(new FlowLayout());
        f.add(buttonPanel);
        f.add(textPanel);

        // create components
        Label l = new Label("Hello World");
        TextField t = new TextField("Type Here");
        TextArea ta = new TextArea("Type Here");
        Button b = new Button("Click Me");
        List lst = new List(4, false);
        lst.add("Mecury");
        lst.add("Venus");
        lst.add("Earth");
        lst.add("Mars");
        lst.add("Jupiter");
        lst.add("Saturn");
        lst.add("Uranus");
        lst.add("Neptune");
        lst.add("Pluto");
        Choice c = new Choice();
        c.add("Mecury");
        c.add("Venus");
        c.add("Earth");
        Dialog d = new Dialog(f, "hiiiiiiiiii", true); // dialog/popups must have a parent frame despite being separate
        d.setSize(100, 100);

        // add components to panels or frames
        buttonPanel.add(l);
        buttonPanel.add(t);
        buttonPanel.add(b);
        buttonPanel.add(ta);
        textPanel.add(b);
        textPanel.add(lst);
        textPanel.add(c);

        // you have to manually add a listener to make the close button work
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        d.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                d.dispose();
            }
        });

        // action listeners to make buttons do whatever you want
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button was clicked!");
            }
        });

        // finally, make the frames and dialogs visible
        f.setVisible(true);
        d.setVisible(true);
    }
}
