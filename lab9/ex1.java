package lab9;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class ex1 {
    public static void main(String[] args) throws IOException { // alternative to try-catch
        // File object
        File f = new File("lab9/ex1.txt");
        if (f.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File does not exist. Creating file...");
            f.createNewFile();
        }

        // Writer objects
        FileWriter fw = new FileWriter(f);
        fw.write("Hello World!");
        fw.close();
        // you can also use a BufferedWriter
        // better for multiple simultaneous writes
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        bw.write("Hello,World");
        bw.close();

        String line;
        String csvSplitBy = ",";
        List<Employee> employees = new ArrayList<>();

        // read
        BufferedReader br = new BufferedReader(new FileReader(f));
        while ((line = br.readLine()) != null) {
            String[] data = line.split(csvSplitBy);
            System.out.println(data);

            // parse data into object and add to list
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            double salary = Double.parseDouble(data[2]);
            Employee employee = new Employee(name, age, salary);
            employees.add(employee);
        }
        br.close();
    }
}

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters and setters (omitted for brevity)

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
