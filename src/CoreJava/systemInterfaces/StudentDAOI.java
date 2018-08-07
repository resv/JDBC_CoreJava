package CoreJava.systemInterfaces;

import java.sql.SQLException;

import CoreJava.Models.Student;

public interface StudentDAOI {

	 Student getStudentByGmail(String email) throws SQLException;
	
	
	 enum SQL{
		 GETSTUDENTBYEMAIL("SELECT * FROM STUDENT WHERE EMAIL=?");
		 
		 private final String Query;
		 
		 private SQL (String givenQuery){
			 this.Query = givenQuery;
		 }
		 public String getQuery() {
			 return Query;
		 }
	 }
	 
	 static final String getStudentByEmail = "SELECT * FROM STUDENT WHERE EMAIL=?";
	 
}
