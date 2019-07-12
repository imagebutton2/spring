package com.train.service;

/*
 * @author He
 * @Date 2019/7/9
 * @Time 11:44
 * @Description
 **/


import com.train.dao.StatusMapper;
import com.train.pojo.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusService {

    private final StatusMapper statusdao;

    @Autowired
    public StatusService(StatusMapper statusdao) {
        this.statusdao = statusdao;
    }

    //展示审核状态
    public List<Status> showAll(){
        return statusdao.showAll();
    }

    //展示某条培训计划的审核状态
    public Status show(Integer sId){
        return statusdao.show(sId);
    }

}
