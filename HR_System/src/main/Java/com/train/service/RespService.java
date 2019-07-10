package com.train.service;

import com.train.dao.ResponseMapper;
import com.train.pojo.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.Action;
import java.util.List;

/*
 * @author He
 * @Date 2019/7/9
 * @Time 11:35
 * @Description
 **/

@Service
public class RespService {

    private final ResponseMapper responsedao;

    @Autowired
    public RespService(ResponseMapper responsedao) {
        this.responsedao = responsedao;
    }


    //展示所有
    public List<Response> showresp(){
        return responsedao.selectAll();
    }


    //展示一条
    public Response showone(Integer pid){
        return responsedao.selectByPrimaryKey(pid);
    }
    //提交反馈
    public void SetResp(Response response){
        responsedao.insert(response);
    }

    //修改审核总结
    public void SetRespSum(Response response){
        responsedao.UpdateSum(response);
    }

    //修改审核结果
    public void SetRespRes(Response response){
        responsedao.UpdateRes(response);
    }

    //修改审核意见
    public void SetRespView(Response response){
        responsedao.UpdateView(response);
    }

    //删除所有某条
    public void Delete(Integer pId){
        responsedao.DeleteBypId(pId);
    }
}
