package com.example;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class JdbcConnector {

    private final JdbcTemplate jdbcTemplate;

    public JdbcConnector(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Fetch all rows from BOOK table
    public List<Map<String, Object>> findAllRecords() {
        return jdbcTemplate.queryForList("SELECT * FROM BOOK");
    }
    public List<Map<String, Object>> findRecordsBasedOnId(int id) {
        String query = "SELECT * FROM BOOK WHERE ROLLNO = ?";
        return jdbcTemplate.queryForList(query,id);
    }
}
