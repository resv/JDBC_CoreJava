package CoreJava.DAO;

import CoreJava.Models.Student;
import CoreJava.systemInterfaces.StudentDAOI;

public class StudentDAO implements StudentDAOI{
	
	public Student getStudentByGmail(String email) {
		/*NEED TO ADD METHOD BODY
		This method takes a String as a parameter
		and queries the database for an Student
		with such an email and returns a Student Object.*/
	}

	
	public Boolean validateUser(String passToValidate,String comparablePas) {
		/*This method takes two parameters: the first 
		one is the password from the database and the 
		second one is the password from the user input. 
		If both passwords are the same return true 
				otherwise return false.*/
		
	}
	
}
