package entity;

import java.time.LocalDate;

public class Incidents {
	private int IncidentID;
	private String IncidentType;
	private String IncidentDate;
	private String Location;
	private String Description;
	private String Status;
	private int VictimID;
	private int SuspectID;
	private int OfficerID;
	
	public Incidents(int IncidentID,String IncidentType,String IncidentDate,String Location,String Description,String Status,int VictimID,int SuspectID,int OfficerID ) 
	{
		this.IncidentID=IncidentID;
		this.IncidentType=IncidentType;
		this.IncidentDate=IncidentDate;
		this.Location=Location;
		this.Description=Description;
		this.Status=Status;
		this.VictimID=VictimID;
		this.SuspectID=SuspectID;
		this.OfficerID=OfficerID;
		
	}
	
	public int getIncidentID() {
        return IncidentID;
    }

    public void setIncidentID(int incidentID) {
        IncidentID = incidentID;
    }

    public String getIncidentType() {
        return IncidentType;
    }

    public void setIncidentType(String incidentType) {
        IncidentType = incidentType;
    }

    public String getIncidentDate() {
        return IncidentDate;
    }

    public void setIncidentDate(String localDate) {
        IncidentDate = localDate;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public int getVictimID() {
        return VictimID;
    }

    public void setVictimID(int victimID) {
        VictimID = victimID;
    }

    public int getSuspectID() {
        return SuspectID;
    }

    public void setSuspectID(int suspectID) {
        SuspectID = suspectID;
    }

    public int getOfficerID() {
        return OfficerID;
    }

    public void setOfficerID(int officerID) {
        OfficerID = officerID;
    }
}

