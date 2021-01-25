package module4.practice;

public class Person {

    private String name;
    public Person(String name) {
        this.name = name;

    }
    public String toString() {
        return this.getName();

    }

    public String getName() {
        return this.name;
    }

    String msg() {
        return "Person Hi";
    }
}
