package main;
import java.sql.*;
import java.util.*;
import entity.*;
import util.*;
import dao.*;
import java.util.List;
import exception.*;


public class main_module {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		boolean exit=false;
		while(!exit)
		{
			System.out.println("\n=== Crime Analysis and Reporting System ===");
	        System.out.println("1. Create Incident");
	        System.out.println("2. Update Incident Status");
	        System.out.println("3. Get Incidents in Date Range");
	        System.out.println("4. Search Incidents");
	        System.out.println("5. Generate Incident Report");
	        System.out.println("6. Exit");
	        System.out.print("Enter your choice: ");
	        int choice=scanner.nextInt();
	        
	        switch(choice)
	        {
	        case 1:
	        	Incidents incident=getInputs.createIncidentInput();
	        	if(CrimeAnalysisImpl.createIncident(incident))
	        	{
	        		System.out.println("Incident Created Successfully...!");
	        	}
	        	break;
	        	
	        case 2:
	        	System.out.println("Enter Incident ID :");
	        	int IncidentID=scanner.nextInt();
	        	scanner.nextLine();
	        	System.out.println("Enter current Status of Incident :");
	        	String ReportStatus=scanner.nextLine();
	        	
	        	CrimeAnalysisImpl.updateIncidentStatus(ReportStatus, IncidentID);
	        	break;
	        	
	        case 3:
	        	System.out.println("Enter a start Date(yyyy-mm-dd) : ");
	        	String startDate=scanner.nextLine();
	        	scanner.nextLine();
	        	
	        	System.out.println("Enter a end Date (yyyy-mm-dd) : ");
	        	String endDate=scanner.nextLine();
	        	
	        	List<Incidents> incidents = null;

	        	try {
        	    incidents = CrimeAnalysisImpl.getIncidentInDateRange(startDate, endDate);

        	    if (incidents != null && !incidents.isEmpty()) {
        	        CrimeAnalysisImpl.printArrayList(incidents);
        	    } else {
        	        throw new IncidentNotFoundInDateRangeException("No incidents found in the given date range.");
        	    }
	        	} catch (IncidentNotFoundInDateRangeException e) {
	        	    System.err.println(e.getMessage());
	        	} catch (Exception e) {
	        	    e.printStackTrace();
	        	}
	        	
	        	break;
	        	

	        	
	        	
	        case 4:
	        	scanner.nextLine();
	        	System.out.println("Enter Incident Type to search Incident : ");
	        	String IncidentType=scanner.nextLine();
	        	
	        	List<Incidents> inci = CrimeAnalysisImpl.getIncidentsByIncidentType(IncidentType);
	        	
	        	if(inci!=null && !inci.isEmpty())
	        	{
	        		CrimeAnalysisImpl.printArrayList(inci);
	        	}
	        	else
	        	{
	        		System.out.println("No Incident of type "+IncidentType+"\n");
	        	}
	        	
	        	break;
	        	
	        	
	        case 5:
	        	try {
	        	    scanner.nextLine();
	        	    System.out.println("Enter your Incident ID to view the current Report: ");
	        	    int IncidentID1 = scanner.nextInt();

	        	    List<Reports> reports = CrimeAnalysisImpl.getReportByIncidentID(IncidentID1);

	        	    if (reports != null && !reports.isEmpty()) {
	        	        CrimeAnalysisImpl.printReportsArrayList(reports);
	        	    } else {
	        	        throw new IncidentNumberNotFoundException("No Incident with ID " + IncidentID1 + " found.");
	        	    }
	        	} catch (IncidentNumberNotFoundException e) {
	        	    System.err.println(e.getMessage());
	        	} catch (Exception e) {
	        	    e.printStackTrace();
	        	}

	        	break;
	        	
	        case 6:
	        	System.out.println("Exiting... Goodbye!");
                exit = true;
                break;
                
	        default:
                System.out.println("Invalid choice. Please try again.");
	        }
		}
		
		
		
	}

}
