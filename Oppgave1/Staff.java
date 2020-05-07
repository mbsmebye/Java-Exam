package Oppgave1;

public class Staff extends Person implements Payable {

    private double salary;    

    public Staff() {};
    
    public Staff(String firstName, String lastName) {
            super(firstName, lastName);
        }

    public Staff(String firstName, String lastName, int age) {
            super(firstName, lastName, age);
        }
        
    public Staff(String firstName, String lastName, int age, double salary) {
            super(firstName, lastName, age);
            this.salary = salary;
    }
    
    public Staff(String firstName, String lastName, int age, Address address, double salary) {
            super(firstName, lastName, age, address);
            this.salary = salary;
    }
    public double getPayment() {
            return 12*salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public String toString() {
        return "Staff: " + this.firstName + ", " + this.lastName + ", " + this.age + ", " + this.getPayment() ;
    }
}