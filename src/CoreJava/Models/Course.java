package CoreJava.Models;

public class Course {
	
	
	//INSTANCIATE VARIABLES AND DATA TYPES
	private int course_id = 0;
	private String course_name;
	private double minimum_gpa = 0;
	

	//CONSTRUCTOR DEFAULT WITH NO FIELDS
	public Course() {
	}

	
	//CONSTRUCTORS WITH FIELDS
	public Course(int course_id, String course_name, double minimum_gpa) {
		this.course_id = course_id;
		this.course_name = course_name;
		this.minimum_gpa = minimum_gpa;
	}
	
	
	//GETTERS AND SETTERS
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public double getMinimum_gpa() {
		return minimum_gpa;
	}
	public void setMinimum_gpa(double minimum_gpa) {
		this.minimum_gpa = minimum_gpa;
	}
}
