-- Schema setup for Airline and Appointment System

CREATE DATABASE IF NOT EXISTS appointmentdb;
USE appointmentdb;

CREATE TABLE IF NOT EXISTS air_tickets (
    ticket_no VARCHAR(50) PRIMARY KEY,
    flight_no VARCHAR(50),
    airline_name VARCHAR(100),
    ticket_type VARCHAR(50),
    seat_no VARCHAR(10),
    seat_class VARCHAR(50),
    flight_date VARCHAR(50),
    depart_time VARCHAR(50),
    arrival_time VARCHAR(50),
    flight_from VARCHAR(100),
    flight_to VARCHAR(100),
    price DECIMAL(10, 2)
);

CREATE TABLE IF NOT EXISTS appointment (
    appointment_num VARCHAR(50) PRIMARY KEY,
    patient_name VARCHAR(100) NOT NULL,
    patient_phone_num VARCHAR(20),
    patient_email VARCHAR(100),
    appointment_date VARCHAR(50),
    appointment_time VARCHAR(50),
    appointment_charges DECIMAL(10, 2),
    payment_method VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS doctor (
    doc_id VARCHAR(50) PRIMARY KEY,
    f_name VARCHAR(50) NOT NULL,
    m_name VARCHAR(50),
    l_name VARCHAR(50) NOT NULL,
    speciality VARCHAR(100),
    phone_num VARCHAR(20),
    email VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS patient (
    patient_id VARCHAR(50) PRIMARY KEY,
    f_name VARCHAR(50) NOT NULL,
    m_name VARCHAR(50),
    l_name VARCHAR(50) NOT NULL,
    dob VARCHAR(30),
    gender VARCHAR(20),
    nationality VARCHAR(50),
    marital_status VARCHAR(30),
    occupation VARCHAR(100),
    phone_num VARCHAR(20),
    email VARCHAR(100)
);