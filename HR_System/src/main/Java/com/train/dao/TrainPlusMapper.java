package com.train.dao;


import com.train.pojo.TrainPlus;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface TrainPlusMapper {

    //按照名称查询培训计划(搜索框搜索)
    List<TrainPlus> selectByName(String trainName);

    //按照审核状态查询培训计划（搜索框搜索）
    List<TrainPlus> selectByStatus(Integer sId);

    //按照培训开始时间查询培训计划（搜索框搜索）
    List<TrainPlus> selectByStartTime(String stime);

    //按照培训结束时间查询培训计划（搜索框搜索）
    List<TrainPlus> selectByEndTime(String etime);

    //展示所有培训计划
    List<TrainPlus> showAll();

}
