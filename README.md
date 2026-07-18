# Airline & Medical Appointment Management System

A robust, multi-package Java desktop application that handles flight ticketing and healthcare appointment workflows, seamlessly backed by a relational MySQL database. This project demonstrates clean Object-Oriented Programming (OOP) principles, multi-package architecture, and secure database persistence via Java Database Connectivity (JDBC).

---

## 🚀 Key Features

- **Airline Ticket Management:** Simulates booking confirmation with automated ticketing IDs generated via `SecureRandom` and custom interactive UI overlays.
- **Medical Management Ecosystem:** Complete registration and handling modules for **Patients**, **Doctors**, and **Appointments**.
- **Interactive GUI Alerts:** Utilizes `javax.swing` dialog components to handle payment methods, process data confirmations, and present structured details dynamically.
- **Robust Database Access Layers:** Segregates business rules from SQL configurations by utilizing separate **Data Access Objects (DAOs)**.
- **Advanced Security Standards:** Protects against malicious SQL injection flaws by using parameterized `PreparedStatement` interfaces.

---

## 📂 Architecture & Package Layout

The codebase utilizes a distinct multi-package architecture to maximize modularity and separation of concerns:

```text
📂 src
 ┣ 📂 com.airline.model         # Core Data Objects (AirTicket, Patient, Doctor, Appointment)
 ┣ 📂 com.airline.database      # Database CRUD Engine & DAO Components (PatientDAO, DoctorDAO, etc.)
 ┗ 📂 com.airline.main          # Main application launcher drivers and simulation setups
📂 db
 ┗ 📜 schema.sql                # Complete relational MySQL schema file
