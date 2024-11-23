package exception;

public class IncidentNotFoundInDateRangeException extends Exception {
    
	private static final long serialVersionUID = 1L;

	public IncidentNotFoundInDateRangeException(String message) {
        super(message);
    }
}
