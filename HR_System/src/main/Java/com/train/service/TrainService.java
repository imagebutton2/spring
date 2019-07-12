package com.train.service;

/*
 * @author He
 * @Date 2019/7/9
 * @Time 11:44
 * @Description
 **/

import com.train.dao.TrainMapper;
import com.train.pojo.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TrainService {

    private final TrainMapper  traindao;

    @Autowired
    public TrainService(TrainMapper traindao) {
        this.traindao = traindao;
    }


    //向数据库中插入培训计划
    public void SetTrainPlan(Train train){
        traindao.insert(train);
    }


    //删除培训计划(按编号)
    public void deletetrain(int tPid){
        traindao.deleteByPrimaryKey(tPid);
    }

    //修改培训名称
    public void SetTrianName(Train train){
        traindao.updateName(train);
    }

    //修改培训讲师
    public void SetTrainTearcher(Train train){
        traindao.updateTeacher(train);
    }

    //修改培训人员
    public void SetTrainMember(Train train){
        traindao.updateMember(train);
    }

    //修改培训简介
    public void SetTrainIntro(Train train){
        traindao.updateIntro(train);
    }

    //修改培训目的
    public void SetTrainGoal(Train train){
        traindao.updateGoal(train);
    }

    //修改培训起始时间
    public void SetTrainStartTime(Train train){
        traindao.updateStarttime(train);
    }

    //修改培训结束时间
    public void SetTrainEndTime(Train train){
        traindao.updateEndtime(train);
    }

    //审核状态变更
    public void SetTrainStatus(Train train){
        traindao.updateStatus(train);
    }

    public Train getOneTrain(Integer pid){
     return traindao.selectByPrimaryKey(pid);
    }
    public void updateTrain(Train train){
        traindao.updateByPrimaryKey(train);
    }

}
