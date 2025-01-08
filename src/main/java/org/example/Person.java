package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String phoneNumber;
    private String address;

    // Constructor with firstname, lastname, and age
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Constructor with additional parameters (constructor chaining)
    public Person(String firstName, String lastName, int age, String email, String phoneNumber, String address) {
        this(firstName, lastName, age); // Calling the first constructor
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }

    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 20);
        System.out.println("Firstname: " + person.getFirstName());
        System.out.println("LastName: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Is Teen: " + person.isTeen());

        Person anotherPerson = new Person("Jane", "Smith", 17, "jane.smith@example.com", "123-456-7890", "123 Main St");
        System.out.println("Firstname: " + anotherPerson.getFirstName());
        System.out.println("LastName: " + anotherPerson.getLastName());
        System.out.println("Age: " + anotherPerson.getAge());
        System.out.println("Is Teen: " + anotherPerson.isTeen());
    }
}