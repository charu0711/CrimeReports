package util;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DBPropertyUtil
{
	public static String getConnectionString(String DBFileName)
	{
		Properties properties=null;
		String protocol=null;
		String dbname=null;
		String user=null;
		String password=null;
		
		DBFileName="./src/"+DBFileName;
		
		try(FileInputStream input = new FileInputStream(DBFileName))
		{
			properties = new Properties();
			properties.load(input);
			
			protocol=properties.getProperty("protocol");
			dbname=properties.getProperty("dbname");
			user=properties.getProperty("user");
			password=properties.getProperty("password");
			
			
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		
		if(protocol!=null && dbname!=null && user!=null && password!=null)
		{
			return protocol+"/"+dbname+"?user="+user+"&password="+password;
		}
		
		return null;
		
		
		
		
	}
}