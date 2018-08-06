package CoreJava.systemInterfaces;

import java.util.List;

import CoreJava.Models.Teaching;

public interface TeachingDAOI {

	public int registerStudentToCourse(int course_id, int instructor_id);

	List<Teaching> getInstructorsCourses();
	
}
