package com.Snigdha.Snigdha.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.Snigdha.Snigdha.models.Appointment;

public class AppointmentRowMapper implements RowMapper<Appointment> {

    public Appointment mapRow(ResultSet rs, int rowNumber) throws SQLException {

        Appointment appointment = new Appointment();
        // here we setch the data from mysql
        // attribute names must match with column names in the mysql table

        appointment.setAppointmentId(rs.getInt("id"));
        appointment.setPatientId(rs.getInt("pid"));
        appointment.setDoctorId(rs.getInt("did"));
        appointment.setPatientIllness(rs.getString("illness"));
        appointment.setDateOfAppointment(rs.getDate("doa"));
        appointment.setModeOfAppointment(rs.getString("mode"));

        return appointment;

    }

}
