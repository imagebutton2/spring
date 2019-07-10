package com.train.dao;

import com.train.pojo.Response;
import com.train.pojo.ResponseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponseMapper {
    long countByExample(ResponseExample example);

    int deleteByExample(ResponseExample example);


    int insertSelective(Response record);

    List<Response> selectByExample(ResponseExample example);


    Response selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Response record, @Param("example") ResponseExample example);

    int updateByExample(@Param("record") Response record, @Param("example") ResponseExample example);

    int updateByPrimaryKeySelective(Response record);

    int updateByPrimaryKey(Response record);

    //展示所有
    List<Response> selectAll();

    //添加审核反馈
    int insert(Response record);

    //修改审核总结
    int UpdateSum(Response record);

    //修改审核结果
    int UpdateRes(Response record);

    //修改审核意见
    int UpdateView(Response record);

    //删除审核反馈
    void DeleteBypId(Integer pid);

}