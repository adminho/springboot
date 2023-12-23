package com.example.jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.jdbc.model.Customer;

public class CustomerRowMapper implements RowMapper<Customer> {

    @Override
    public Customer mapRow(final ResultSet rs, final int rowNum) throws SQLException {
        return new Customer(rs.getLong("id"), rs.getString("first_name"), rs.getString("last_name"));
    }
}
