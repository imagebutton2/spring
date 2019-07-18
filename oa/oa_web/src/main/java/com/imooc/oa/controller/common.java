package com.imooc.oa.controller;

import com.imooc.oa.biz.EmployeeBiz;
import com.imooc.oa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("common")
public class common {
@Autowired
private EmployeeBiz employeeBiz;
    @RequestMapping("getTest")
    public String getTest(Map<String,Object> map){
        List<Employee> employeeBizlist = employeeBiz.getAll();
        map.put("employeeBizlist",employeeBizlist);
        return "test";
    }
}
