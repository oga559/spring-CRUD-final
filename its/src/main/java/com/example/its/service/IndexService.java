package com.example.its.service;

import com.example.its.entity.Index;

import java.util.List;

public interface IndexService {
    void save(Index index);

    List<Index> getAll();
}
