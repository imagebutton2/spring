package com.train.dao;

import com.train.pojo.Train;
import com.train.pojo.TrainExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainMapper {
    long countByExample(TrainExample example);

    int deleteByExample(TrainExample example);

    //删除培训计划
    void deleteByPrimaryKey(Integer tPid);

    //展示所有培训计划
    List<Train> showAll();

    //添加培训计划
    int insert(Train record);

    //修改培训名称
    int updateName(Train train);

    //修改培训讲师
    int updateTeacher(Train train);

    //修改参训人员
    int updateMember(Train train);

    //修改培训目的
    int updateGoal(Train train);

    //修改培训简介
    int updateIntro(Train train);

    //修改起始时间
    int updateStarttime(Train train);

    //修改结束时间
    int updateEndtime(Train train);

    //审核状态变更
    int updateStatus(Train train);




    int insertSelective(Train record);

    List<Train> selectByExample(TrainExample example);

    Train selectByPrimaryKey(Integer tPid);

    int updateByExampleSelective(@Param("record") Train record, @Param("example") TrainExample example);

    int updateByExample(@Param("record") Train record, @Param("example") TrainExample example);

    int updateByPrimaryKeySelective(Train record);

    int updateByPrimaryKey(Train record);


}