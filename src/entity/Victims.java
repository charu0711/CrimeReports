package entity;

public class Victims {
    private int VictimID; 
    private String FirstName;
    private String LastName;
    private String DateOfBirth;
    private String Gender;
    private String Address;
    private String PhoneNumber;

    
    public Victims(int VictimID, String FirstName, String LastName, String DateOfBirth,String Gender, String Address, String PhoneNumber) {
        
    	this.VictimID = VictimID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.DateOfBirth = DateOfBirth;
        this.Gender = Gender;
        this.Address = Address;
        this.PhoneNumber = PhoneNumber;
    }

    
    public int getVictimID() {
        return VictimID;
    }

    public void setVictimID(int victimID) {
        VictimID = victimID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
