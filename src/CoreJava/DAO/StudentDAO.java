package CoreJava.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import CoreJava.Models.Student;
import CoreJava.systemInterfaces.StudentDAOI;

public class StudentDAO implements StudentDAOI {

	public Student getStudentByGmail(String email) throws SQLException {

		/*
		 * NEED TO ADD METHOD BODY This method takes a String as a parameter and queries
		 * the database for an Student with such an email and returns a Student Object.
		 */

//		Student student = new Student();

		Student student = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet result = null;

		try {

			conn = OracleConnection.getConnection();
			ps = conn.prepareStatement(SQL.GETSTUDENTBYEMAIL.getQuery());
			ps.setString(1, email);
			result = ps.executeQuery();
			if (result.next()) {
				student.setStudent_id(result.getInt(1));
				student.setFull_name(result.getString(2));
				student.setEmail(result.getString(3));
				student.setGpa(result.getDouble(4));
				student.setPass(result.getString(5));
				student.setStudent_role(result.getInt(6));
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			result.close();
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
		return student;
	}

	public Boolean validateUser(String passToValidate, String comparablePas) {
		/*
		 * This method takes two parameters: the first one is the password from the
		 * database and the second one is the password from the user input. If both
		 * passwords are the same return true otherwise return false.
		 */

	}

}
