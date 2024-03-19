package lab9;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.*;

public class ex2 {
    public static void main(String[] args) throws IOException {
        FruitsManager fruitsManager = new FruitsManager("lab9/ex2.txt");

        JFrame frame = new JFrame("Fruit Inventory");
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JTable table = new JTable();
        DefaultTableModel model = new DefaultTableModel(new String[] { "Name", "Quantity", "Price", "Company" }, 0);
        for (Fruit fruit : fruitsManager.getFruits()) {
            model.addRow(new Object[] { fruit.getName(), fruit.getQuantity(), fruit.getPrice(), fruit.getCompany() });
        }
        table.setModel(model);
        panel.add(new JScrollPane(table));

        JButton addButton = new JButton("Add Fruit");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = JOptionPane.showInputDialog("Enter fruit name:");
                if (name != null) {
                    int quantity = 0;
                    double price = 0.0;
                    try {
                        quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity:"));
                        price = Double.parseDouble(JOptionPane.showInputDialog("Enter price:"));
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Please enter numbers.");
                        return;
                    }
                    String company = JOptionPane.showInputDialog("Enter company:");
                    Fruit fruit = new Fruit(name, quantity, price, company);
                    try {
                        fruitsManager.addFruit(fruit);
                        model.addRow(new Object[] { name, quantity, price, company });
                    } catch (IOException e1) {
                        e1.printStackTrace();
                        JOptionPane.showMessageDialog(null, "File failed to save");
                    }
                }
            }
        });
        panel.add(addButton);

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                try {
                    fruitsManager.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        frame.setVisible(true);
    }
}

class FruitsManager {
    private File f;
    private BufferedWriter bw;
    List<Fruit> fruits = new ArrayList<>();

    public List<Fruit> getFruits() {
        return fruits;
    }

    public FruitsManager(String filename) throws IOException {
        f = new File(filename);
        createFileIfNotExists();
        fruits = readFromFile();
        bw = new BufferedWriter(new FileWriter(f, false));
        writeAllToFile();
    }

    public void createFileIfNotExists() throws IOException {
        if (f.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File does not exist. Creating file...");
            f.createNewFile();
        }
    }

    public List<Fruit> readFromFile() throws IOException {
        List<Fruit> fruits = new ArrayList<>();
        String line;
        String csvSplitBy = ",";
        BufferedReader br = new BufferedReader(new FileReader(f));
        while ((line = br.readLine()) != null) {
            String[] data = line.split(csvSplitBy);
            String name = data[0];
            int quantity = Integer.parseInt(data[1]);
            double price = Double.parseDouble(data[2]);
            String company = data[3];
            Fruit fruit = new Fruit(name, quantity, price, company);
            fruits.add(fruit);
        }
        br.close();
        return fruits;
    }

    public void writeAllToFile() throws IOException {
        for (Fruit fruit : fruits) {
            bw.write(fruit.toString());
            bw.newLine();
        }
        bw.flush();
    }

    public void addFruit(Fruit fruit) throws IOException {
        fruits.add(fruit);
        bw.append(fruit.toString());
    }

    public void close() throws IOException {
        bw.close();
    }
}

class Fruit {
    private String name;
    private int quantity;
    private double price;
    private String company;

    public Fruit(String name, int quantity, double price, String company) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return name + "," + quantity + "," + price + "," + company;
    }
}
