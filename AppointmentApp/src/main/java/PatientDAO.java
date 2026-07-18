import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PatientDAO {

	    private static final String URL = "jdbc:mysql://127.0.0.1:3306/appointmentdb";
	    private static final String USER = "root";
	    private static final String PASSWORD = "admin"; // Change this to your database password

	    /**
	     * Saves a Patient object directly into the MySQL database.
	     */
	    public void savePatient(Patient patient) {
	        String sql = "INSERT INTO patient (patient_id, f_name, m_name, l_name, dob, gender, " +
	                     "nationality, marital_status, occupation, phone_num, email) " +
	                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
	             PreparedStatement pstmt = con.prepareStatement(sql)) {

	            // Binding all 11 fields securely to the PreparedStatement mapping positions
	            pstmt.setString(1, patient.PatientID);
	            pstmt.setString(2, patient.FName);
	            pstmt.setString(3, patient.MName);
	            pstmt.setString(4, patient.LName);
	            pstmt.setString(5, patient.DOB);
	            pstmt.setString(6, patient.Gender);
	            pstmt.setString(7, patient.Nationality);
	            pstmt.setString(8, patient.MaritalStatus);
	            pstmt.setString(9, patient.Occupation);
	            pstmt.setString(10, patient.PhoneNum);
	            pstmt.setString(11, patient.Email);

	            int rowsInserted = pstmt.executeUpdate();
	            if (rowsInserted > 0) {
	                System.out.println("Success! Patient ID " + patient.PatientID + " has been recorded.");
	            }

	        } catch (SQLException e) {
	            System.err.println("Database error occurred while saving the patient record!");
	            e.printStackTrace();
	        }
	    }
}
