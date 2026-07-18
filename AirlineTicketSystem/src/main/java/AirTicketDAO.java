import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class AirTicketDAO {
	
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/airlineticketsystemdb";
    private static final String USER = "root";
    private static final String PASSWORD = "admin"; // Match your password here

    // Method to save an AirTicket object directly into MySQL
    public void saveTicket(AirTicket ticket) {
        String sql = "INSERT INTO air_ticket (ticket_no, flight_no, airline_name, ticket_type, " +
                     "seat_no, seat_class, flight_date, depart_time, arrival_time, flight_from, flight_to, price) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        // Automatically opens and safely closes database components
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            // Mapping your class attributes to the SQL wildcards (?) safely
            pstmt.setString(1, ticket.getTicketNo());
            pstmt.setString(2, ticket.getFlightNo());
            pstmt.setString(3, ticket.getAirlineName());
            pstmt.setString(4, ticket.getTickettype());
            pstmt.setString(5, ticket.getSeatNum());
            pstmt.setString(6, ticket.getSeatClass());
            pstmt.setString(7, ticket.getFlightDepartureDate());
            pstmt.setString(8, ticket.getFlightDepartureTime());
            pstmt.setString(9, ticket.getFlightArrivalTime());
            pstmt.setString(10, ticket.getDepartDestination());
            pstmt.setString(11, ticket.getArrivalDestination());
            pstmt.setDouble(12, ticket.getFarePrice());

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Success! Ticket #" + ticket.getTicketNo() + " saved to MySQL database.");
            }

        } catch (SQLException e) {
            System.err.println("Database error occurred while saving the ticket!");
            e.printStackTrace();
        }
    }

}
