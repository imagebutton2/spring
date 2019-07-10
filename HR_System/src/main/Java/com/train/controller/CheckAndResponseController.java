package com.train.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * @author He
 * @Date 2019/7/9
 * @Time 12:42
 * @Description TODO
 **/
//考核
@Controller
@RequestMapping("CheckAndResponse")
public class CheckAndResponseController {
    @RequestMapping("getCheckAndResponse")
    public String getCheckAndResponse(){
        return "assess";
    }
}
