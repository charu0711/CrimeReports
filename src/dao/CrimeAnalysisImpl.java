package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;
import entity.Incidents;
import util.DBConnUtil;
import exception.*;
import entity.*;

public abstract class CrimeAnalysisImpl implements CrimeAnalysisDAO{
	
	
	private static Connection connection;
	
	static
	{
		connection = DBConnUtil.getConnectionObject();
	}
	
	public static boolean createIncident(Incidents incident)
	{
		String query="INSERT INTO INCIDENTS VALUES(?,?,?,?,?,?,?,?,?)";
		
		try(PreparedStatement stmt=connection.prepareStatement(query))
		{
			stmt.setInt(1, incident.getIncidentID());
			stmt.setString(2, incident.getIncidentType());
			stmt.setString(3, incident.getIncidentDate());
			stmt.setString(4, incident.getLocation());
			stmt.setString(5, incident.getDescription());
			stmt.setString(6, incident.getStatus());
			stmt.setInt(7, incident.getVictimID());
			stmt.setInt(8, incident.getSuspectID());
			stmt.setInt(9, incident.getOfficerID());
			
			stmt.executeUpdate();
			
			return true;

		}
		catch(SQLException sql)
		{
			sql.printStackTrace();
		}
		
		return false;
		
	}
	
	public static boolean updateIncidentStatus(String ReportStatus,int IncidentID)
	{
		String query1 = "UPDATE INCIDENTS SET STATUS=? WHERE INCIDENTID=?";
	    String query2 = "UPDATE REPORTS SET STATUS=? WHERE INCIDENTID=?";
		
	    try
	    (PreparedStatement stmt1 = connection.prepareStatement(query1);
	    PreparedStatement stmt2 = connection.prepareStatement(query2))
	    {
	    	stmt1.setString(1, ReportStatus);
	    	stmt1.setInt(2, IncidentID);
	    	
	    	stmt2.setString(1, ReportStatus);
	    	stmt2.setInt(2, IncidentID);
	    	
	    	stmt1.executeUpdate();
	    	stmt2.executeUpdate();
	    	
	    	System.out.println("Status has been Updated Successfully...");
	    	return true;
	    	
	    }
	    catch(SQLException sql)
	    {
	    	sql.printStackTrace();
	    }
	    
	    
		return false;
		
	}
	
	public static List<Incidents> getIncidentInDateRange(String startDate,String endDate)
	{
		
		List<Incidents> incidents=new ArrayList<>();
		String query="SELECT * FROM INCIDENTS WHERE INCIDENTDATE BETWEEN ? AND ?";
		try(Connection connection=DBConnUtil.getConnectionObject())
		{
			PreparedStatement stmt=connection.prepareStatement(query);
			stmt.setString(1, startDate);
			stmt.setString(2, endDate);
			
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next())
			{
				while (rs.next()) {
				    Incidents incident = new Incidents(
				        rs.getInt("IncidentID"),
				        rs.getString("IncidentType"),
				        rs.getString("IncidentDate"),
				        rs.getString("Location"),
				        rs.getString("Description"),
				        rs.getString("Status"),
				        rs.getInt("VictimID"),
				        rs.getInt("SuspectID"),
				        rs.getInt("OfficerID")
				    );
				    incidents.add(incident);
				}
			}
		}
		catch(SQLException sql)
		{
			sql.printStackTrace();
			return null;
		}
		
		
		return incidents;
		
	}
	
	public static List<Incidents> getIncidentsByIncidentType(String IncidentType)
	{
		String query="SELECT * FROM INCIDENTS WHERE INCIDENTTYPE = ?";
		List<Incidents> incidents=new ArrayList<>();
		
		try(Connection connection=DBConnUtil.getConnectionObject())
		{
			PreparedStatement stmt=connection.prepareStatement(query);
			stmt.setString(1,IncidentType);
			
			ResultSet rs=stmt.executeQuery();
			
			while (rs.next()) {
			    Incidents incident = new Incidents(
			        rs.getInt("IncidentID"),
			        rs.getString("IncidentType"),
			        rs.getString("IncidentDate"),
			        rs.getString("Location"),
			        rs.getString("Description"),
			        rs.getString("Status"),
			        rs.getInt("VictimID"),
			        rs.getInt("SuspectID"),
			        rs.getInt("OfficerID")
			    );
			    incidents.add(incident);	
			}
			
		}
		catch(SQLException sql)
		{
			sql.printStackTrace();
			return null;
		}
		
		return incidents;
	}
	
	public static List<Reports> getReportByIncidentID(int IncidentType)
	{
		
		String query="SELECT * FROM REPORTS WHERE INCIDENTID=?";
		List<Reports> reports=new ArrayList<>();
		
		try(Connection connection=DBConnUtil.getConnectionObject())
		{
			PreparedStatement stmt=connection.prepareStatement(query);
			stmt.setInt(1, IncidentType);
			
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next())
			{
				Reports report = new Reports(
				        rs.getInt("ReportID"),                
				        rs.getInt("IncidentID"),             
				        rs.getInt("ReportingOfficer"),       
				        rs.getString("ReportDate"), 
				        rs.getString("ReportDetails"),       
				        rs.getString("Status")               
				    );
				
				reports.add(report);
			}
			
			return reports;
			
		}
		catch(SQLException sql)
		{
			sql.printStackTrace();
			return null;
		}
		
	}
	
	
	public static void printArrayList(List<Incidents> incidents) {
	    System.out.println("Incident Details:");
	    for (Incidents incident : incidents) {
	        System.out.println("Incident ID: " + incident.getIncidentID());
	        System.out.println("Type: " + incident.getIncidentType());
	        System.out.println("Date: " + incident.getIncidentDate());
	        System.out.println("Location: " + incident.getLocation());
	        System.out.println("Description: " + incident.getDescription());
	        System.out.println("Status: " + incident.getStatus());
	        System.out.println("Victim ID: " + incident.getVictimID());
	        System.out.println("Suspect ID: " + incident.getSuspectID());
	        System.out.println("Officer ID: " + incident.getOfficerID());
	        System.out.println("--------------------------");
	    }
	}
	
	public static void printReportsArrayList(List<Reports> reports) {
	    System.out.println("Report Details:");
	    for (Reports report : reports) {
	        System.out.println("Report ID: " + report.getReportID());
	        System.out.println("Incident ID: " + report.getIncidentID());
	        System.out.println("Reporting Officer: " + report.getReportingOfficer());
	        System.out.println("Report Date: " + report.getReportDate());
	        System.out.println("Report Details: " + report.getReportDetails());
	        System.out.println("Status: " + report.getStatus());
	        System.out.println("--------------------------");
	    }
	}
	
	
}
