package com.Snigdha.Snigdha.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HomeRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void createDatabase() {
        String sql_query = "CREATE schema IF NOT EXISTS Snigdha";
        jdbcTemplate.execute(sql_query);
    }
    
}