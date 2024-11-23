package entity;

public class Suspects {
    private int SuspectID; 
    private String FirstName;
    private String LastName;
    private String DateOfBirth;
    private String Gender;
    private String Address;
    private String PhoneNumber;

    
    public Suspects(int SuspectID, String FirstName, String LastName, String DateOfBirth, 
                    String Gender, String Address, String PhoneNumber) {
        this.SuspectID = SuspectID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.DateOfBirth = DateOfBirth;
        this.Gender = Gender;
        this.Address = Address;
        this.PhoneNumber = PhoneNumber;
    }

    
    public int getSuspectID() {
        return SuspectID;
    }

    public void setSuspectID(int suspectID) {
        SuspectID = suspectID;
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
