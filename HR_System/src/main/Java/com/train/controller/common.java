package com.train.controller;

import com.train.pojo.Response;
import com.train.pojo.Status;
import com.train.pojo.Train;
import com.train.pojo.TrainPlus;
import com.train.service.RespService;
import com.train.service.StatusService;
import com.train.service.TrainPlusService;
import com.train.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RequestMapping("common")
@Controller
public class common {
    @Autowired
    private StatusService statusService;
    @Autowired
    private TrainPlusService trainPlusService;
    @Autowired
    RespService respService;
    @Autowired
    TrainService trainService;

    @RequestMapping("getAll")
    public String getAll(Map<String, Object> map) {
        List<Status> statuses = statusService.showAll();
        List<TrainPlus> trains = trainPlusService.showtrain();
        map.put("statuses", statuses);
        map.put("trains", trains);
        return "content";
    }

    @RequestMapping("deleteAll")
    public String deleteAll(Map<String, Object> map, HttpServletRequest request) {
        String pid = request.getParameter("pid");
        trainService.deletetrain(Integer.parseInt(pid));
        respService.Delete(Integer.parseInt(pid));
        return "redirect:/common/getAll";
    }

    @RequestMapping("select")
    public String select(Map<String, Object> map, HttpServletRequest request) {
        String selectName = request.getParameter("selectName");
        List<TrainPlus> trains = trainPlusService.GetByName(selectName);
        map.put("trains", trains);
        return "content";
    }

    @RequestMapping("getDetail")
    public String getDetail(Map<String, Object> map, HttpServletRequest request) {
        String pid = request.getParameter("pid");
        Train train = trainService.getOneTrain(Integer.parseInt(pid));
        map.put("train", train);
        Response respon = respService.showone(Integer.parseInt(pid));
        map.put("respon", respon);
        return "detail";
    }
}
