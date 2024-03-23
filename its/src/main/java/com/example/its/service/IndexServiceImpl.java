package com.example.its.service;

import com.example.its.entity.Index;
import com.example.its.repository.IndexDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexServiceImpl implements IndexService{

    //データベースの処理を使うので呼び出す
    private final IndexDao dao;
    private final JdbcTemplate jdbcTemplate;

//    DIしてます
    public IndexServiceImpl(IndexDao dao, JdbcTemplate jdbcTemplate) {
        this.dao = dao;
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(Index index) {
            dao.insertIndex(index);
    }

    @Override
    public List<Index> getAll() {
        return dao.getAll();
    }
}
