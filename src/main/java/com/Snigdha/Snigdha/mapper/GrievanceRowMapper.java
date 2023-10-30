package com.Snigdha.Snigdha.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.Snigdha.Snigdha.models.Grievance;
import java.util.Arrays; 


public class GrievanceRowMapper implements RowMapper<Grievance> {

    public Grievance mapRow(ResultSet rs, int rowNumber) throws SQLException {
        Grievance grievance = new Grievance();
    
        grievance.setGrievanceId(rs.getInt("id"));
        grievance.setGrievance_Ovrl(rs.getInt("experience"));
        
        // Retrieve the "concern(s)" value as a string from the result set
        String concerns = rs.getString("concerns");
        
        // Split the string into a list of strings
        List<String> concernList = Arrays.asList(concerns.split(",")); // Assuming values are comma-separated
        
        grievance.setGrievance_Topic(concernList);
        grievance.setGrievance_Remarks(rs.getString("remarks"));
        // grievance.setGrievance_Pid(rs.getInt("pid"));
    
        return grievance;
    
}


    }

