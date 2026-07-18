import javax.swing.JOptionPane;
import java.security.SecureRandom;
import javax.swing.ImageIcon;
public class AirTicket {
    // Air Ticket Attributes
    public String FlightNo, TicketNo;
    public double Price;
    public String AirlineName;
    public String TicketType;
    public String SeatNo, SeatClass;
    public String FlightDates, FlightDepartTime, FlightArrivalTime;
    public String FlightFrom, FlightTo;
    
    // Constructors
    public AirTicket(String FlightNo, String Class, double Price, String AirlineName, String FlightType){
        this.FlightNo = FlightNo;
        this.SeatClass = Class;
        this.Price = Price;
        this.AirlineName = AirlineName;
        this.TicketType = FlightType;
    }
    public AirTicket(){
        
    }
    
    // Methods
    public void setSeat(String seatNum, String Class){
        this.SeatNo = seatNum;
        this.SeatClass = Class;
    }
    public void setTicketNo(){
        SecureRandom rand = new SecureRandom();
        Integer upperbound = 10000;
        Integer TicketNum = rand.nextInt(upperbound);
        String ticketNo = TicketNum.toString();
        this.TicketNo = ticketNo;
        
    }
    public void setFlightNo(String Num){
        this.FlightNo = Num;
    }
    public void setFarePrice(double price){
        this.Price = price;
    }
    public void setAirlineName(String Name){
        this.AirlineName = Name;
    }
    public void setTicketType(String type){
        this.TicketType = type;
    }
    public void setFlightDate(String Date){
        this.FlightDates = Date;
        
    }
    public void setFlightTimes(String departTime, String arrivalTime){
        this.FlightDepartTime = departTime;
        this.FlightArrivalTime = arrivalTime;
    }
    public void setFlightDestinations(String From, String To){
        this.FlightFrom = From;
        this.FlightTo = To;
    }
    public String getFlightNo(){
        return FlightNo;
    }
    public double getFarePrice(){
        return Price;
    }
    public String getAirlineName(){
        return AirlineName;
    }
    public String getTickettype(){
        return TicketType;
    }
    public String getSeatNum(){
        return SeatNo; 
    }
    public String getSeatClass(){
        return SeatClass;
    }
    public String getFlightDepartureDate(){
        return FlightDates;
    }
    public String getFlightDepartureTime(){
        return FlightDepartTime;
    }
    public String getFlightArrivalTime(){
        return FlightArrivalTime;
    }
    public String getDepartDestination(){
        return FlightFrom;
    } 
    public String getArrivalDestination(){
        return FlightTo;
    }
    public String getTicketNo(){
        return TicketNo;
    }
    public void checkTicketInfo(){
        ImageIcon icon = new ImageIcon("Flight Icon 5.2.png");
        JOptionPane.showMessageDialog(null, 
                "Flight Number - "+FlightNo+
                "\nAirline - "+AirlineName+
                "\nType - "+TicketType+
                "\nSeat No. - "+SeatNo+ "   Travel Class - "+SeatClass+
                "\nFrom "+FlightFrom+ " To "+FlightTo+
                "\nFlight Date : "+FlightDates+"\nDeparture Time : "+FlightDepartTime+" Arrival Time : "+FlightArrivalTime
                , "Ticket Information", JOptionPane.INFORMATION_MESSAGE, icon);
    }
}

 