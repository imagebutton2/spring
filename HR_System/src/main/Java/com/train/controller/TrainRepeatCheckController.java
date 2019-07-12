package com.train.controller;

import com.train.pojo.Response;
import com.train.pojo.Status;
import com.train.pojo.Train;
import com.train.pojo.TrainPlus;
import com.train.service.RespService;
import com.train.service.TrainPlusService;
import com.train.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/*
 * @author He
 * @Date 2019/7/9
 * @Time 12:42
 * @Description TODO
 **/
//复核
@Controller
@RequestMapping("TrainCheck")
public class TrainRepeatCheckController {
    @Autowired
    RespService respService;
    @Autowired
    TrainService trainService;

    @RequestMapping("getTrainCheck1")
    public String getTrainCheck1(Map<String, Object> map, HttpServletRequest request){
        String pid=request.getParameter("pid");
        Train train=trainService.getOneTrain(Integer.parseInt(pid));
        map.put("train", train);
        Response respon=respService.showone(Integer.parseInt(pid));
        map.put("respon",respon);
        return "check1";
    }
    @RequestMapping("pass")
    public String pass(Map<String, Object> map, HttpServletRequest request){
        String pid=request.getParameter("pid");
        Train train=trainService.getOneTrain(Integer.parseInt(pid));
        train.setsId(3);
        trainService.updateTrain(train);
        Response respon=respService.showone(Integer.parseInt(pid));
        respon.setView(request.getParameter("view"));
        respService.SetRespView(respon);
        return "redirect:/common/getAll";
    }

    @RequestMapping("getTrainCheck2")
    public String getTrainCheck2(Map<String, Object> map, HttpServletRequest request){
        String pid=request.getParameter("pid");
        Train train=trainService.getOneTrain(Integer.parseInt(pid));
        map.put("train", train);
        Response respon=respService.showone(Integer.parseInt(pid));
        map.put("respon",respon);
        return "check2";
    }
    @RequestMapping("refuse")
    public String refuse(Map<String, Object> map, HttpServletRequest request){
        String pid=request.getParameter("pid");
        Train train=trainService.getOneTrain(Integer.parseInt(pid));
        train.setsId(4);
        trainService.updateTrain(train);
        Response respon=respService.showone(Integer.parseInt(pid));
        respon.setView(request.getParameter("view"));
        respService.SetRespView(respon);
        return "redirect:/common/getAll";
    }
}
