package com.Snigdha.Snigdha.models;

import java.time.java.sql.Date;

public class Appointment {

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getPatientIllness() {
        return patientIllness;
    }

    public void setPatientIllness(String patientIllness) {
        this.patientIllness = patientIllness;
    }

    public java.sql.Date getDateOfAppointment() {
        return dateOfAppointment;
    }

    public void setDateOfAppointment(java.sql.Date dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }

    public String getModeOfAppointment() {
        return modeOfAppointment;
    }

    public void setModeOfAppointment(String modeOfAppointment) {
        this.modeOfAppointment = modeOfAppointment;
    }

    private int appointmentId;
    private int patientId;
    private int doctorId;
    private String patientIllness;
    private java.sql.Date dateOfAppointment;
    private String modeOfAppointment;
}
