package com.train.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
    @RequestMapping("getTrainCheck")
    public String getTrainCheck(){
        return "check";
    }
}
