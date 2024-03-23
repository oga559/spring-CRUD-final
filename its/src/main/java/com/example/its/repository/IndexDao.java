package com.example.its.repository;


import com.example.its.entity.Index;

import java.util.List;

public interface IndexDao {
    void insertIndex(Index index);
    List<Index> getAll();
}
