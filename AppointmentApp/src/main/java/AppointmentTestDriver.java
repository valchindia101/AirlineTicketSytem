
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.*;

public class AppointmentTestDriver {
    public static void main(String[] args) {
        Appointment A1 = new Appointment();
        A1.setAppointmentNum("A-314619");
        A1.setDate("15-Sept-2023");
        A1.setPatientName("Rey Mysterio");
        A1.setPatientPhoneNum("0734567541");
        A1.setAppointmentCharges(4000.00);
        A1.setTime("15:00 HRS");
        A1.setPaymentMethod();
        A1.AppointmentInfo();
        
        AppointmentDAO dbhandler = new AppointmentDAO();
        dbhandler.saveAppointment(A1);
        
       /* Doctor D1 = new Doctor();
        D1.setFName();
        D1.setMName();
        D1.setLName();
        D1.setDocID();
        D1.setSpeciality();
        D1.setPhoneNum();
        D1.setEmail();*\
       
        
       /* Doctor D2 = new Doctor();
        D2.setDocID();
        D2.setFName();
        D2.setMName();
        D2.setLName();
        D2.setSpeciality();
        D2.setPhoneNum();
        D2.setEmail();
        D2.getDocInfo2();*/
        
        Patient P1 = new Patient();
        P1.setFname();
        P1.setMName();
        P1.setLName();
        P1.setGender();
        P1.setMaritalStatus();
        P1.setNationality();
        P1.setPatientID();
        P1.setOccupation();
        P1.setPhoneNum();
        P1.setDOB();
        P1.setEmail();
        P1.showPatientDetails();
        
        PatientDAO dbhandler1 = new PatientDAO();
        dbhandler1.savePatient(P1);
        
    }
  
}
