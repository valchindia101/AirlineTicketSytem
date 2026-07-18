import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DoctorDAO {
	
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/appointmentdb";
    private static final String USER = "root";
    private static final String PASSWORD = "admin"; // Match your MySQL password

    /**
     * Saves a Doctor object directly into the MySQL database.
     */
    public void saveDoctor(Doctor doc) {
        String sql = "INSERT INTO doctor (doc_id, f_name, m_name, l_name, speciality, phone_num, email) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            // Mapping your class fields directly to the SQL query positional indexes
            pstmt.setString(1, doc.DocID);
            pstmt.setString(2, doc.FName);
            pstmt.setString(3, doc.MName);
            pstmt.setString(4, doc.LName);
            pstmt.setString(5, doc.Speciality);
            pstmt.setString(6, doc.PhoneNum);
            pstmt.setString(7, doc.email);

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Success! Doctor ID " + doc.DocID + " has been registered in the database.");
            }

        } catch (SQLException e) {
            System.err.println("Database error occurred while saving the doctor record!");
            e.printStackTrace();
        }
    }

}
