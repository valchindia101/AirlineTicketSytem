import java.util.*;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Doctor {
	
	public String FName, MName, LName;
	public String DocID, Speciality;
	public String PhoneNum, email;
	
	Doctor(){
		
	}
	Scanner scanner = new Scanner(System.in);
	public void setFName() {
		System.out.print("Enter First Name:\n");
		String FName = scanner.nextLine();
		this.FName = FName;
		
	}
	public void setMName() {
		System.out.print("Enter Middle Name:\n");
		String MName = scanner.nextLine();
		this.MName = MName;
	}
	public void setLName() {
		System.out.print("Enter Last Name:\n");
		String LName = scanner.nextLine();
		this.LName = LName;
	}
	public void setDocID() {
		System.out.print("Enter Doctor ID:\n");
		String DocID = scanner.nextLine();
		this.DocID = DocID;
	}
	public void setSpeciality() {
		System.out.print("Enter Doctor Speciality:\n");
		String Speciality = scanner.nextLine();
		this.Speciality = Speciality;
	}
	public void setPhoneNum() {
		System.out.print("Enter Doctor Phone Number:\n");
		String PhoneNum = scanner.nextLine();
		this.PhoneNum = PhoneNum;
	}
	public void setEmail() {
		System.out.print("Enter Doctor Email:\n");
		String email = scanner.nextLine();
		
		this.email = email;
	}
	
	public void getDocInfo() {
		JOptionPane.showMessageDialog(null, "Full Names: "+this.FName+" "+this.MName+" "+this.LName+"\n"+
	"Doctor ID: "+this.DocID+"\n"+"Speciality: "+this.Speciality+"\n"+"Contact Details:\n"+"Phone Number: "+this.PhoneNum+
	"\n"+"Email: "+this.email);
	}
	
	public void getDocInfo2() {
		ImageIcon icon = new ImageIcon("doctor.png");
		String Title = "Doctor Details";
		JOptionPane.showMessageDialog(null, "Full Names: "+this.FName+" "+this.MName+" "+this.LName+"\n"+
				"Doctor ID: "+this.DocID+"\n"+"Speciality: "+this.Speciality+"\n"+"Contact Details:\n"+"Phone Number: "+this.PhoneNum+
				"\n"+"Email: "+this.email, Title, JOptionPane.INFORMATION_MESSAGE, icon);
		
	}
	

}
