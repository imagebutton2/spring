package com.train.service;

import com.train.dao.TrainPlusMapper;
import com.train.pojo.TrainPlus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * @author He
 * @Date 2019/7/9
 * @Time 16:09
 * @Description
 **/
@Service
public class TrainPlusService {
    private final TrainPlusMapper trainplusdao;

    @Autowired
    public TrainPlusService(TrainPlusMapper trainplusdao) {
        this.trainplusdao = trainplusdao;
    }

    //按照训练计划名称进行查询
    public List<TrainPlus> GetByName(String trainame) {
        return trainplusdao.selectByName(trainame);
    }

    //按照审核状态进行查询
    public List<TrainPlus> GetByStatus(Integer sId) {
        return trainplusdao.selectByStatus(sId);
    }

    //按照起始时间查询
    public List<TrainPlus> GetByStartTime(String stime) {
        return trainplusdao.selectByStartTime(stime);
    }

    //按照结束时间进行查询
    public List<TrainPlus> GetByEndTime(String etime) {
        return trainplusdao.selectByEndTime(etime);
    }

    //展示所有培训计划
    public List<TrainPlus> showtrain() {
        return trainplusdao.showAll();
    }
}
