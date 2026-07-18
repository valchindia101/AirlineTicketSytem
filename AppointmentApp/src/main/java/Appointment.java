
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Appointment {
    public String Date,Time;
    public String AppointmentNum;
    public String PatientName;
    public String PatientPhoneNum;
    public String PatientEmail;
    public double AppointmentCharges;
    public String PaymentMethod;
    
    Appointment(String Name, String phoneNum, String date, String time){
        this.PatientName = Name;
        this.PatientPhoneNum = phoneNum;
        this.Date = date;
        this.Time = time;
    }
    
    public Appointment(){
        
    }
    
    public void setPatientName(String name){
        this.PatientName = name;
    }
    
    public void setDate(String setDate){
        this.Date = setDate;
    }
    public void setTime( String time){
        this.Time = time;
    }
    public void setAppointmentCharges(double cost){
        this.AppointmentCharges = cost;
        }
    public void setPatientPhoneNum(String Num ){
        this.PatientPhoneNum = Num;
    }
    public void setPatientEmail(String email){
        this.PatientEmail = email;
    }
    
    public void setAppointmentNum(String ANum){
        this.AppointmentNum = ANum;
    }
    
    public void setPaymentMethod(){
        ImageIcon icon = new ImageIcon("healthcare icon1.png");
        String[] responses = {"Mobile Money", "Card", "Crypto Currency"};
       int option = JOptionPane.showOptionDialog(null, "Select Payment Method", "Payment", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);
        if(option == 0){
            String Mpesa = "Mpesa";
            this.PaymentMethod = Mpesa;
        }
        else if(option == 1){
            String Card = "Card";
            this.PaymentMethod = Card;
        }
        else if(option == 2){
            String Bitcoin = "Bitcoin";
            this.PaymentMethod = Bitcoin;
        }
    
    }
    
    
    public void AppointmentInfo(){
        ImageIcon icon = new ImageIcon("healthcare icon1.png");
        JOptionPane.showMessageDialog(null, "Patient Name: "+PatientName+"\n"
                +"Phone Number: "+PatientPhoneNum+"\nAppointment Date: "+Date
                +"\nAppointment Time: "+Time+"\nAppointment No: "+AppointmentNum+
                "\nAppointment Charge: KES "+this.AppointmentCharges+
                "\nPayment Method: "+PaymentMethod, 
                "Appointment Information", JOptionPane.INFORMATION_MESSAGE, icon);
    }
    
    
    
}
