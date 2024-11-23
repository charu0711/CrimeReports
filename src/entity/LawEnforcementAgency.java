package entity;

public class LawEnforcementAgency {
    private int AgencyID; 
    private String AgencyName;
    private String Jurisdiction;
    private String Address;
    private String PhoneNumber;
    private int officer;  

    
    public LawEnforcementAgency(int AgencyID, String AgencyName, String Jurisdiction, 
                                String Address, String PhoneNumber, int officer) {
        this.AgencyID = AgencyID;
        this.AgencyName = AgencyName;
        this.Jurisdiction = Jurisdiction;
        this.Address = Address;
        this.PhoneNumber = PhoneNumber;
        this.officer = officer;
    }

    
    public int getAgencyID() {
        return AgencyID;
    }

    public void setAgencyID(int agencyID) {
        AgencyID = agencyID;
    }

    public String getAgencyName() {
        return AgencyName;
    }

    public void setAgencyName(String agencyName) {
        AgencyName = agencyName;
    }

    public String getJurisdiction() {
        return Jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        Jurisdiction = jurisdiction;
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

    public int getOfficer() {
        return officer;
    }

    public void setOfficer(int officer) {
        this.officer = officer;
    }
}
