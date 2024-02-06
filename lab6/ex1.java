package lab6;

public class ex1 {
    public static void main(String[] args) {
        human lily = new human("Lily", 20, 1.6, 50);
        lily.eat("burger");
        lily.eat("pizza");
        lily.eat("fried noodle");
        lily.drink("coffee");
        lily.drink("pepsi");
        lily.drink("orange juice");
    }
}

class human {
    private String name;
    private int age;
    private double height, weight;

    public human(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void sleep() {
        System.out.println(name + " is Sleeping");
    }

    public void eat(String food) {
        System.out.println(name + " is Eating " + food);
    }

    public void drink(String drink) {
        System.out.println(name + " is Drinking " + drink);
    }
}

class square {
    private double length;

    public square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return length * length;
    }

    public double getPerimeter() {
        return 4 * length;
    }
}
