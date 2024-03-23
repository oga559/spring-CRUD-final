package com.example.its.repository;

import com.example.its.entity.Index;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class IndexDaoImpl implements IndexDao{
    private final JdbcTemplate jdbcTemplate;

    public IndexDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //    voidは、returnしない
    @Override
    public void insertIndex(Index index) {
        jdbcTemplate.update("INSERT INTO index(name, email) VALUES(?,?)",index.getName(),index.getEmail());
    }

    @Override
    public List<Index> getAll() {
        return null;
    }
}
