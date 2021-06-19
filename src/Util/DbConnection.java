package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	static Connection cn;
	public static Connection getConnection()
    {
        try
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");    
        }
        catch(Exception e){
            
        }
        return cn;
        }
		
		  public static void closeConnection(Connection con) 
		  { 
			  try{ 
				  if(con!=null) {
					  con.close(); 
					  } 
				  } 
			  catch(SQLException e) 
			  { 
				  e.printStackTrace(); 
				  }
		  
		  }
		 
}
