package CoreJava.DAO;

import java.util.List;

import CoreJava.Models.Instructor;
import CoreJava.systemInterfaces.InstructorDAOI;

public class InstructorDAO implements InstructorDAOI{

	
	List<Instructor> getAllInstructors(){
		/*This method takes no parameter and returns 
		 * every Instructor in the database.*/
	}
	
	Instructor getInstructoByGmail(String email) {
		/*This method takes a String as a parameter and 
		queries the database for an Instructor with such 
		an email and returns an Instructor Object*/
	}
	
	String validateUser(Instructor ins, String comparablePas) {
		 /*This method takes two arguments: an instructor
		 object with all its information and a String
		 which represent the password entered by the user 
		 trying to login as an instructor. This returns 
		 “Wrong Credentials”, “Admin” or “Instructor”.*/
	}
	
}
