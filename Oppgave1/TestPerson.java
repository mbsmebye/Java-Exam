package Oppgave1;

public class TestPerson {

    public static void main(String[] args) {
        Address staffAddress = new Address("Kongens gate 1", "0001", "Norway");

        Person staffObject = new Staff("Ola", "Nordmann", 42, staffAddress, 50000.0);
        Person studentObject = new Student("Espen", "Askeladd", 23);
        System.out.println(studentObject);
        System.out.println(staffObject);
        ((Staff) staffObject).setSalary(60000.0);
        System.out.println(staffObject);
    }
    
}