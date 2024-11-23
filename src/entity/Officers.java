package entity;

public class Officers {
    private int OfficerID; // 
    private String FirstName;
    private String LastName;
    private String BadgeNumber;
    private String Rank;
    private String Address;
    private String PhoneNumber;
    private int AgencyID; 

    // Constructor
    public Officers(int OfficerID, String FirstName, String LastName, String BadgeNumber, 
                   String Rank, String Address, String PhoneNumber, int AgencyID) {
        this.OfficerID = OfficerID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.BadgeNumber = BadgeNumber;
        this.Rank = Rank;
        this.Address = Address;
        this.PhoneNumber = PhoneNumber;
        this.AgencyID = AgencyID;
    }

    
    public int getOfficerID() {
        return OfficerID;
    }

    public void setOfficerID(int officerID) {
        OfficerID = officerID;
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

    public String getBadgeNumber() {
        return BadgeNumber;
    }

    public void setBadgeNumber(String badgeNumber) {
        BadgeNumber = badgeNumber;
    }

    public String getRank() {
        return Rank;
    }

    public void setRank(String rank) {
        Rank = rank;
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

    public int getAgencyID() {
        return AgencyID;
    }

    public void setAgencyID(int agencyID) {
        AgencyID = agencyID;
    }
}
