package lt.boreisa.model;

public class Employee {

    private int id;
    private String name;
    // ADDRESS IS DEPENDENT OBJECT!!
    private Address address;

    public Employee () {} // Default Constr.

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void show () {
        System.out.println("show() method");
        this.address.anyMethod();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String toString () {
        return String.format("[ID] %d [NAME] %s [FROM] %s", id, name, address);
    }
}
