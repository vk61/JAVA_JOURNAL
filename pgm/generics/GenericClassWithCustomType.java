// Custom class Person
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // toString method to print the Person object nicely
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

// Generic class Box that holds an object of any type T
class Box<T> {
    // Field to hold the value of type T
    private T value;

    // Constructor to initialize the value
    public Box(T value) {
        this.value = value;
    }

    // Method to set the value
    public void setValue(T value) {
        this.value = value;
    }

    // Method to get the value
    public T getValue() {
        return value;
    }

    // Method to display the type of the value
    public void displayType() {
        System.out.println("Type of value: " + value.getClass().getName());
    }
}

public class GenericClassWithCustomType {
    public static void main(String[] args) {
        // Creating a Person object
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);

        // Creating a Box object to hold a Person object (custom type)
        Box<Person> personBox = new Box<>(person1);
        System.out.println("Value in personBox: " + personBox.getValue());
        personBox.displayType();  // Displays the type of value inside the Box

        // Changing the value inside the box
        personBox.setValue(person2);
        System.out.println("Updated value in personBox: " + personBox.getValue());
        personBox.displayType();  // Displays the type of value inside the Box
    }
}
