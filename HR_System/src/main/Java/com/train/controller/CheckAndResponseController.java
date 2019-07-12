package com.train.controller;

import com.train.pojo.Response;
import com.train.pojo.Train;
import com.train.service.RespService;
import com.train.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


//考核
@Controller
@RequestMapping("CheckAndResponse")
public class CheckAndResponseController {
    @Autowired
    RespService respService;
    @Autowired
    TrainService trainService;

    @RequestMapping("getCheckAndResponse")
    public String getCheckAndResponse(Map<String, Object> map, HttpServletRequest request) {
        String pid = request.getParameter("pid");
        Train train = trainService.getOneTrain(Integer.parseInt(pid));
        map.put("train", train);
        Response respon = respService.showone(Integer.parseInt(pid));
        map.put("respon", respon);
        return "replay";
    }

    @RequestMapping("setReplay")
    public String setReplay(Map<String, Object> map, HttpServletRequest request) {
        String pid = request.getParameter("pid");
        Response respon = respService.showone(Integer.parseInt(pid));
        respon.setResponse(request.getParameter("response"));
        respService.SetRespContent(respon);
        respon.setSummary(request.getParameter("summary"));
        respService.SetRespSum(respon);
        respon.setResult(request.getParameter("result"));
        respService.SetRespRes(respon);
        return "redirect:/common/getAll";
    }

}
