package dao;
import entity.*;
import java.util.Scanner;

public class getInputs {
	
	public static Scanner scanner=new Scanner(System.in);
	
	public static Incidents createIncidentInput()
	{
		System.out.println("Enter Incident ID : ");
		int IncidentID = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Enter IncidentType (e.g., Robbery, Homicide, Theft) :");
		String IncidentType = scanner.nextLine();

		System.out.println("Enter Incident Date (yyyy-mm-dd) :");
		String IncidentDate = scanner.nextLine();

		System.out.println("Enter Location (Geospatial Data: Latitude and Longitude) : ");
		String Location = scanner.nextLine();

		System.out.println("Enter Description : ");
		String Description = scanner.nextLine();

		System.out.println("Enter Status (e.g., Open, Closed, Under Investigation) : ");
		String Status = scanner.nextLine();

		System.out.println("Enter Victim ID : ");
		int VictimID = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Enter Suspect ID : ");
		int SuspectID = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Enter Officer ID : ");
		int OfficerID = scanner.nextInt();
		

		
		Incidents incident=new Incidents(IncidentID,IncidentType,IncidentDate,Location,Description,Status,VictimID,SuspectID,OfficerID);
		
		return incident;
	}
}
