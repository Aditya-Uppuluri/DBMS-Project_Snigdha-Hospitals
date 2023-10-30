package com.Snigdha.Snigdha.dao;

import com.Snigdha.Snigdha.mapper.PatientRowMapper;
import com.Snigdha.Snigdha.models.Patient;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
public class PatientRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void createPatientTable() {
        String sql_query = "CREATE TABLE IF NOT EXISTS patient (id int AUTO_INCREMENT,patientname varchar(30),dob date,blood varchar(10),phone bigint,PRIMARY KEY(id))";
        jdbcTemplate.update(sql_query);
    }

    public List<Patient> showAllPatients() {
        String sql_query = "SELECT * FROM patient";
        return jdbcTemplate.query(sql_query, new PatientRowMapper());

    }

    public void createPatient(Patient patient) {
        String sql_query = "INSERT INTO patient (patientname,dob,blood,phone) VALUES (?,?,?,?)";
        jdbcTemplate.update(sql_query,
                patient.getPatientName(),
                patient.getPatientDob(),
                patient.getPatientBlood(),
                patient.getPatientPhone());
    }

    public void cancelPatient(int patientId) {
        String sql_query = "DELETE FROM patient WHERE id = ?";
        jdbcTemplate.update(sql_query,
                patientId);
    }

}
