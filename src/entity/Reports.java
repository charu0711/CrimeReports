package entity;

public class Reports {
    private int ReportID;  
    private int IncidentID;  
    private int ReportingOfficer;  
    private String ReportDate;
    private String ReportDetails;
    private String Status;  

    
    public Reports(int ReportID, int IncidentID, int ReportingOfficer, String ReportDate, 
                  String ReportDetails, String Status) {
        this.ReportID = ReportID;
        this.IncidentID = IncidentID;
        this.ReportingOfficer = ReportingOfficer;
        this.ReportDate = ReportDate;
        this.ReportDetails = ReportDetails;
        this.Status = Status;
    }

    
    public int getReportID() {
        return ReportID;
    }

    public void setReportID(int reportID) {
        ReportID = reportID;
    }

    public int getIncidentID() {
        return IncidentID;
    }

    public void setIncidentID(int incidentID) {
        IncidentID = incidentID;
    }

    public int getReportingOfficer() {
        return ReportingOfficer;
    }

    public void setReportingOfficer(int reportingOfficer) {
        ReportingOfficer = reportingOfficer;
    }

    public String getReportDate() {
        return ReportDate;
    }

    public void setReportDate(String reportDate) {
        ReportDate = reportDate;
    }

    public String getReportDetails() {
        return ReportDetails;
    }

    public void setReportDetails(String reportDetails) {
        ReportDetails = reportDetails;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
