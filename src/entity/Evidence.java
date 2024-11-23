package entity;

public class Evidence {
	
	
	private int EvidenceID;
	private int IncidentID;
	private String LocationFound;
	private String Description;
	
	public Evidence(int EvidenceID,int IncidentID,String LocationFound,String Description)
	{
		this.EvidenceID=EvidenceID;
		this.IncidentID=IncidentID;
		this.LocationFound=LocationFound;
		this.Description=Description;
		
	}
	
	public int getEvidenceID()
	{
		return EvidenceID;
	}
	
	public int getIncidentID()
	{
		return IncidentID;
	}
	
	public String getLocationFound()
	{
		return LocationFound;
	}
	
	public String getDescription()
	{
		return Description;
	}
	
	public void setEvidenceID(int EvidenceID)
	{
		this.EvidenceID=EvidenceID;
	}
	
	public void setIncidentID(int IncidentID)
	{
		this.IncidentID=IncidentID;
	}
	
	public void setLocationFound(String LocationFound)
	{
		this.LocationFound=LocationFound;
	}
	
	public void setDescription(String Description)
	{
		this.Description=Description;
	}
}
