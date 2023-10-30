package com.Snigdha.Snigdha.dao;

import com.Snigdha.Snigdha.mapper.DoctorRowMapper;
import com.Snigdha.Snigdha.models.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
public class DoctorRepository {

    @Autowired
    private final JdbcTemplate jdbcTemplate;

    public DoctorRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void createDoctorTable() {
        String sql_query = "CREATE TABLE IF NOT EXISTS doctor (id int AUTO_INCREMENT,doctorname varchar(30),qualification varchar(10),department varchar(20),fees int,phone bigint,PRIMARY KEY(id))";
        jdbcTemplate.update(sql_query);
    }

    public List<Doctor> showAllDoctors() {
        String sql_query = "SELECT * FROM doctor";
        return jdbcTemplate.query(sql_query, new DoctorRowMapper());
    }

    public void createDoctor(Doctor doctor) {
        String sql_query = "INSERT INTO doctor (doctorname,qualification,department,fees,phone) VALUES (?,?,?,?,?)";
        jdbcTemplate.update(sql_query,
                doctor.getDoctorName(),
                doctor.getDoctorQualification(),
                doctor.getDoctorDepartment(),
                doctor.getDoctorFees(),
                doctor.getDoctorPhone());
    }

    public void cancelDoctor(int doctorId) {
        String sql_query = "DELETE FROM doctor WHERE id = ?";
        jdbcTemplate.update(sql_query, doctorId);
    }

}
