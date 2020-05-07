package Oppgave1;

public abstract class Person{

    protected String firstName;
    protected String lastName;
    protected int age;
    protected Address address;

    public Person() {}

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
    public Person(String firstName, String lastName, int age, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }
    
	public String getFirstName() {
        return firstName;
	}
    
	public void setFirstName(String firstName) {
        this.firstName = firstName;
	}
    
	public String getLastName() {
        return lastName;
	}
    
	public void setLastName(String lastName) {
        this.lastName = lastName;
	}
    
	public Address getAddress() {
        return address;
	}
    
	public void setAddress(Address address) {
        this.address = address;
	}
    
	public int getAge() {
        return age;
	}
    
	public void setAge(int age) {
        this.age = age;
	}
    
    public abstract String toString();
    
}