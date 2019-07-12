package com.train.pojo;

public class Train {
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



    public Train() {
    }

    public Train(Integer sId, String tName, String tTeacher, String tMember, String tGoal, String tIntroduction, String tStart, String tEnd) {
        this.sId = sId;
        this.tName = tName;
        this.tTeacher = tTeacher;
        this.tMember = tMember;
        this.tGoal = tGoal;
        this.tIntroduction = tIntroduction;
        this.tStart = tStart;
        this.tEnd = tEnd;
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
        this.tName = tName == null ? null : tName.trim();
    }

    public String gettTeacher() {
        return tTeacher;
    }

    public void settTeacher(String tTeacher) {
        this.tTeacher = tTeacher == null ? null : tTeacher.trim();
    }

    public String gettMember() {
        return tMember;
    }

    public void settMember(String tMember) {
        this.tMember = tMember == null ? null : tMember.trim();
    }

    public String gettGoal() {
        return tGoal;
    }

    public void settGoal(String tGoal) {
        this.tGoal = tGoal == null ? null : tGoal.trim();
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

    public String gettIntroduction() {
        return tIntroduction;
    }

    public void settIntroduction(String tIntroduction) {
        this.tIntroduction = tIntroduction;
    }


    @Override
    public String toString() {
        return "Train{" +
                "tPid=" + tPid +
                ", sId=" + sId +
                ", tName='" + tName + '\'' +
                ", tTeacher='" + tTeacher + '\'' +
                ", tMember='" + tMember + '\'' +
                ", tGoal='" + tGoal + '\'' +
                ", tIntroduction='" + tIntroduction + '\'' +
                ", tStart='" + tStart + '\'' +
                ", tEnd='" + tEnd + '\'' +
                '}';
    }
}
