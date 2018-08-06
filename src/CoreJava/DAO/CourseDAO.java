package CoreJava.DAO;

import java.util.List;

import CoreJava.Models.Course;
import CoreJava.systemInterfaces.CourseDAOI;

public class CourseDAO implements CourseDAOI{

	public List<Course> getAllCourses(){
		/*This method takes no parameter and returns 
		every Course in the database.*/
	}
	
	
	List<Course> getCourseByInstructor(int instructor_id){
		/*This method takes an int as a parameter and 
		queries the database for all the courses one 
		instructor is assigned to.*/
	}
	
	
}
