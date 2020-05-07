package Oppgave1;

public class Student extends Person {

    public Student() {};

    public Student(String firstName, String lastName) {
        super(firstName, lastName);

    }

public Student(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }
    
    public String toString() {
        return "Student: " + this.firstName + ", " + this.lastName + ", " + this.age;
    }
}