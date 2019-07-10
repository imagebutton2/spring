package com.train.pojo;

/*
 * @author He
 * @Date 2019/7/9
 * @Time 15:35
 * @Description
 **/

import java.util.Date;

public class TrainPlus {
    //培训编号
    private Integer tPid;

    //状态编号
    private Integer sId;

    //培训名称
    private String tName;

    //培训讲师
    private String tTeacher;

    //参训人员
    private String tMember;

    //培训目的
    private String tGoal;

    //培训简介
    private String tIntroduction;

    //起始时间
    private String tStart;

    //结束时间
    private String tEnd;

    //培训反馈
    private Response resp;

    public TrainPlus() {
    }

    public Integer gettPid() {
        return tPid;
    }

    public void settPid(Integer tPid) {
        this.tPid = tPid;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettTeacher() {
        return tTeacher;
    }

    public void settTeacher(String tTeacher) {
        this.tTeacher = tTeacher;
    }

    public String gettMember() {
        return tMember;
    }

    public void settMember(String tMember) {
        this.tMember = tMember;
    }

    public String gettGoal() {
        return tGoal;
    }

    public void settGoal(String tGoal) {
        this.tGoal = tGoal;
    }

    public String gettIntroduction() {
        return tIntroduction;
    }

    public void settIntroduction(String tIntroduction) {
        this.tIntroduction = tIntroduction;
    }

    public String gettStart() {
        return tStart;
    }

    public void settStart(String tStart) {
        this.tStart = tStart;
    }

    public String gettEnd() {
        return tEnd;
    }

    public void settEnd(String tEnd) {
        this.tEnd = tEnd;
    }

    public Response getResp() {
        return resp;
    }

    public void setResp(Response resp) {
        this.resp = resp;
    }

    @Override
    public String toString() {
        return "TrainPlus{" +
                "tPid=" + tPid +
                ", sId=" + sId +
                ", tName='" + tName + '\'' +
                ", tTeacher='" + tTeacher + '\'' +
                ", tMember='" + tMember + '\'' +
                ", tGoal='" + tGoal + '\'' +
                ", tIntroduction='" + tIntroduction + '\'' +
                ", tStart=" + tStart +
                ", tEnd=" + tEnd +
                ", response{" +"id="+ resp.getPid()+",content:"+resp.getResponse() +
                '}';
    }
}

