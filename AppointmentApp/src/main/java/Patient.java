import java.util.*;
import javax.swing.*;
public class Patient {
	
	String FName, MName, LName;
	String DOB, Gender, Nationality, MaritalStatus, Occupation;
	String PatientID;
	String PhoneNum, Email;
	
	Patient(){
		
	}
    Scanner scanner = new Scanner(System.in);
	public void setFname() {
		
		System.out.println("Enter First Name: ");
		String FName = scanner.nextLine();
		this.FName = FName;
		
	}
	
	public void setMName() {
		System.out.println("Enter Middle Name: ");
		String MName = scanner.nextLine();
		this.MName = MName;
	}
	
	public void setLName() {
		System.out.println("Enter Last Name: ");
		String LName = scanner.nextLine();
		this.LName = LName;
	}
	
	public void setDOB() {
		System.out.println("Enter Date of Birth - Format: yyyy-mm-dd ");
		String DOB = scanner.nextLine();
		this.DOB = DOB;
	}
	
	public void setGender() {
		System.out.println("Enter Gender: ");
		String Gender = scanner.nextLine();
		this.Gender = Gender;
	}
	
	public void setNationality() {
		System.out.println("Enter Nationality: ");
		String Nationality = scanner.nextLine();
		this.Nationality = Nationality;
	}
	
	public void setMaritalStatus() {
		System.out.println("Enter Marital Status: ");
		String MaritalStatus = scanner.nextLine();
		this.MaritalStatus = MaritalStatus;
	}
	public void Occupation() {
		System.out.println("Enter Occupation: ");
		String Occupation = scanner.nextLine();
		this.Occupation = Occupation;
	}
	
	public void setPatientID() {
		System.out.println("Enter Patient ID: ");
		String PatientID = scanner.nextLine();
		this.PatientID = PatientID;
	}
	
	public void setPhoneNum() {
		System.out.println("Enter Phone Number: ");
		String PhoneNum = scanner.nextLine();
		this.PhoneNum = PhoneNum;
	}
	public void setOccupation() {
		System.out.println("Enter Occupation: ");
		String Occupation = scanner.nextLine();
		this.Occupation = Occupation;
	}
	
	public void setEmail() {
		System.out.println("Enter Email Address: ");
		String Email = scanner.nextLine();
		this.Email = Email;
		scanner.close();
	}
	
	public void showPatientDetails() {
		ImageIcon icon = new ImageIcon("patient.png");
		String Title = "Patient Details";
		JOptionPane.showMessageDialog(null,"Full Names: "+this.FName+" "+this.MName+" "+this.LName+"\n"+"Date Of Birth: "+this.DOB
				+"\nGender: "+this.Gender+"\nNationality: "+this.Nationality+"\nMarital Status: "+this.MaritalStatus+"\nOccupation: "+this.Occupation
				+"\nPatient ID: "+this.PatientID+"\nPhone Number: "+this.PhoneNum+"\nEmail: "+this.Email ,Title , JOptionPane.INFORMATION_MESSAGE, icon);
	}
}
