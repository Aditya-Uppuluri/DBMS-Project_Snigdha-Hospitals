package com.Snigdha.Snigdha.mapper;

import com.Snigdha.Snigdha.models.Patient;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

// public class PatientRowMapper {

// }

public class PatientRowMapper implements RowMapper<Patient> {

    public Patient mapRow(ResultSet rs, int rowNumber) throws SQLException {

        Patient patient = new Patient();
        // here we setch the data from mysql
        // attribute names must match with column names in the mysql table

        patient.setPatientId(rs.getInt("id"));
        patient.setPatientName(rs.getString("patientname"));
        patient.setPatientDob(rs.getDate("dob"));
        patient.setPatientBlood(rs.getString("blood"));
        patient.setPatientPhone(rs.getLong("phone"));

        return patient;

    }

}