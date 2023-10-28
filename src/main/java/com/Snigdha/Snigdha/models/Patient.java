package com.Snigdha.Snigdha.models;

import java.time.java.sql.Date;

public class Patient {

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public java.sql.Date getPatientDob() {
        return patientDob;
    }

    public void setPatientDob(java.sql.Date patientDob) {
        this.patientDob = patientDob;
    }

    public String getPatientBlood() {
        return patientBlood;
    }

    public void setPatientBlood(String patientBlood) {
        this.patientBlood = patientBlood;
    }

    public Long getPatientPhone() {
        return patientPhone;
    }

    public void setPatientPhone(Long patientPhone) {
        this.patientPhone = patientPhone;
    }

    private int patientId;
    private String patientName;
    private java.sql.Date patientDob;
    private String patientBlood;
    private Long patientPhone;

    public Patient(int id, String name, java.sql.Date dob, String blood, Long phone) {
        this.patientId = id;
        this.patientName = name;
        this.patientDob = dob;
        this.patientBlood = blood;
        this.patientPhone = phone;
    }

    public Patient() {

    };

    @Override
    public String toString() {
        return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", patientDob=" + patientDob
                + ", patientBlood=" + patientBlood + ", patientPhone=" + patientPhone + "]";
    }
}
