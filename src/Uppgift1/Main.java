package Uppgift1;

import java.util.List;

class Person {
    private String name;
    private String gender;
    private double salary;

    public Person(String name, String gender, double salary) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class Main {

    public static void main(String[] args) {


    }
    List<Person> persons = List.of(
            new Person("Dennis", "Male", 15500),
            new Person("Hanna", "Female", 28000),
            new Person("Marianne", "Female", 19000),
            new Person("Jussi", "Male", 41000),
            new Person("Bill", "Male", 95000),
            new Person("Marie", "Female", 34000),
            new Person("Thomas", "Male", 31000),
            new Person("Johanna", "Female", 25000),
            new Person("Mikael", "Male", 39000),
            new Person("Simon", "Male", 29000)
    );
}
