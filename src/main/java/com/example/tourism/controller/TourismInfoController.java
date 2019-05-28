package com.example.tourism.controller;

import com.example.tourism.dao.TourismDao;
import com.example.tourism.model.TourismInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class TourismInfoController {

    @Autowired
    private TourismDao tourismDao;

    @RequestMapping(value = "/getTourismInfo", method = {RequestMethod.GET}, consumes = {"application/x-www-form-urlencoded"})
    @ResponseBody
    private Object getTourismInfo(@RequestParam(name = "tourismName") String tourismName){
        TourismInfo tourismInfo = tourismDao.selectInfoByName(tourismName);
        return tourismInfo;
    }

}
