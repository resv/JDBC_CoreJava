package CoreJava.DAO;

import java.util.List;

import CoreJava.Models.Teaching;
import CoreJava.systemInterfaces.TeachingDAOI;

public class TeachingDAO implements TeachingDAOI{

	@Override
	public int registerStudentToCourse(int course_id, int instructor_id) {
		/*This method takes as a parameter a course_id and a instructor_id 
		int and perform an INSERT query into the TEACHING table to assign 
		an instructor to a course.*/
		
	}

	@Override
	public List<Teaching> getInstructorsCourses() {
		/*This method takes no parameters and queries the database for 
		every instructor assigned to a course.*/
	}

	
	
}
