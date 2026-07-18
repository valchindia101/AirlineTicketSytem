import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AppointmentDAO {
	
	// Using the database name from your previous error log
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/appointmentdb";
    private static final String USER = "root";
    private static final String PASSWORD = "admin"; // Match your MySQL password

    /**
     * Saves an Appointment object directly into the MySQL database.
     */
    public void saveAppointment(Appointment app) {
        String sql = "INSERT INTO appointment (appointment_num, patient_name, patient_phone_num, " +
                     "patient_email, appointment_date, appointment_time, appointment_charges, payment_method) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        // Try-with-resources safely manages connections and prevents memory leaks
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            // Mapping your class attributes directly to the database column positions
            pstmt.setString(1, app.AppointmentNum);
            pstmt.setString(2, app.PatientName);
            pstmt.setString(3, app.PatientPhoneNum);
            pstmt.setString(4, app.PatientEmail);
            pstmt.setString(5, app.Date);
            pstmt.setString(6, app.Time);
            pstmt.setDouble(7, app.AppointmentCharges);
            pstmt.setString(8, app.PaymentMethod);

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Success! Appointment No. " + app.AppointmentNum + " has been saved to MySQL.");
            }

        } catch (SQLException e) {
            System.err.println("Database error occurred while saving the appointment!");
            e.printStackTrace();
        }
    }

}
