package Classes;

public class Student {
    private Name name;
    private Address address;
    private String telephoneNumber;

    public Student() {
        
        name = new Name();
        address = new Address();
        this.telephoneNumber = "";
    }

    public Student(Name name, Address address, String telephoneNumber) {
        this.name = name;
        this.address = address;

    }
    public void setName(Name name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
    
    public Name getName() {
        return name;
    }
    
    public Address getAddress() {
        return address;
    }
    
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    @Override
    public String toString() {
        return name + "@" + address + "@" + telephoneNumber;
    }
     
      
}