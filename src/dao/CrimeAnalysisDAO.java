package dao;
import entity.*;
import java.util.Collection;
import java.util.List;

public interface CrimeAnalysisDAO {
	
	
	
	
	public List<Incidents> searchIncidents(String IncidentType);
	
	public Reports generateIncidentReport(Incidents incident);
	
}
