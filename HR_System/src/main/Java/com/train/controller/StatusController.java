package com.train.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StatusController {
    //申请复核
    //修改 状态
    @RequestMapping("setStatus")
    public String setStatus() {
        return "success";
    }
}
