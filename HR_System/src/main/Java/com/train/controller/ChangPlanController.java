package com.train.controller;


import com.train.pojo.Response;
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

//修改
@Controller
@RequestMapping("ChangPlan")
public class ChangPlanController {
    @Autowired
    TrainService trainService;
    @Autowired
    private TrainPlusService trainPlusService;
    @Autowired
    RespService respService;

    @RequestMapping("setPlan")
    public String setPlan() {
        return "updata";
    }
    @RequestMapping("upData")
    public String upData(Map<String, Object> map, HttpServletRequest request) {
        Train train = new Train();
        train.setsId(1);
        train.settName(request.getParameter("tName"));
        train.settTeacher(request.getParameter("tTeacher"));
        train.settStart(request.getParameter("tStart"));
        train.settEnd(request.getParameter("tEnd"));
        train.settGoal(request.getParameter("tGoal"));
        train.settMember(request.getParameter("tMember"));
        train.settIntroduction(request.getParameter("tIntroduction"));
        trainService.SetTrainPlan(train);
         Response response=new Response();
         response.setPid(train.gettPid());
         respService.insertResp(response);
        return "redirect:/common/getAll";
    }
    @RequestMapping("set")
    public  String set(Map<String, Object> map, HttpServletRequest request){
        String pid=request.getParameter("pid");
        Train trains=trainService.getOneTrain(Integer.parseInt(pid));
        map.put("trains", trains);
        return "set";
    }
    @RequestMapping("setData")
    public String setData(Map<String, Object> map, HttpServletRequest request) {
        Train train = new Train();
        String pid=request.getParameter("pid");
        train.settPid(Integer.parseInt(pid));
        train.setsId(2);
        train.settName(request.getParameter("tName"));
        train.settTeacher(request.getParameter("tTeacher"));
        train.settStart(request.getParameter("tStart"));
        train.settEnd(request.getParameter("tEnd"));
        train.settGoal(request.getParameter("tGoal"));
        train.settMember(request.getParameter("tMember"));
        train.settIntroduction(request.getParameter("tIntroduction"));
        trainService.updateTrain(train);
        return "redirect:/common/getAll";
    }


}
