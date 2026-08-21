
public class AirTicketTest {
    public static void main(String[] args) {
        AirTicket a1 = new AirTicket("A-104","Economy", 20000, "Etihad Airways", "One-Way");
        a1.setFlightDestinations("NBO", "LDN");
        a1.setFlightTimes("14:00", "23:00");
        a1.setSeat("F-24","Economy");
        a1.setFlightDate("14-JUN-2023");
        a1.setTicketNo();
        
        AirTicket a2 = new AirTicket("C-619","Economy" ,30000, "Kenya Airways", "Return");
        a2.setTicketNo();
        a2.setFlightDate("15-Sep-2023");
        a2.setFlightDestinations("DXB", "ROM");
        a2.setFlightTimes("5:00", "12:00");
        a2.setSeat("W-02", "Business Class");
        
        a2.checkTicketInfo();
    }
}
