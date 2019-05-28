package com.example.tourism.dao;

import com.example.tourism.model.TourismInfo;
import org.springframework.stereotype.Component;

@Component
public interface TourismDao {

    TourismInfo selectInfoByName(String name);
}
