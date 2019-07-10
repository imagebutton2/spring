package com.train.controller;

import com.train.pojo.Status;
import com.train.pojo.TrainPlus;
import com.train.service.StatusService;
import com.train.service.TrainPlusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@RequestMapping("common")
@Controller
public class common {
    @Autowired
    private StatusService statusService;
    @Autowired
    private TrainPlusService trainPlusService;

    @RequestMapping("getAll")
    public String getAll(Map<String, Object> map) {
        List<Status> statuses = statusService.showAll();
        List<TrainPlus> trains = trainPlusService.showtrain();
        map.put("statuses",statuses);
        map.put("trains", trains);
        return "content";
    }
}
