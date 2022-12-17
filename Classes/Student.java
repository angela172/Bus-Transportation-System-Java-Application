package Classes;

public class Student {
    private Name name;
    private Address address;
    private String Id;
    private String PhoneNo;

    public Student() {
        
        name = new Name();
        address = new Address();
        this.PhoneNo = "";
        this.Id="";
    }

    public Student(Name name, String Id,Address address, String PhoneNo) {
        this.name = name;
        this.address = address;
        this.Id = Id;

    }
    public void setName(Name name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPhoneNo(String PhoneNo) {
        this.PhoneNo = PhoneNo;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    
    public Name getName() {
        return name;
    }
    
    public Address getAddress() {
        return address;
    }
    
    public String getPhoneNo() {
        return PhoneNo;
    }

    @Override
    public String toString() {
        return name + "@" + Id +"@"+ address + "@" + PhoneNo;
    }
     
      
}
