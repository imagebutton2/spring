package com.train.pojo;

public class Response {
    //培训编号
    private Integer pid;

    //培训反馈
    private String response;

    //培训总结
    private String summary;

    //审核结果
    private String result;

    //审核意见
    private String view;

    public Response() {
    }

    public Response(String response, String summary, String result, String view) {
        this.response = response;
        this.summary = summary;
        this.result = result;
        this.view = view;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response == null ? null : response.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view == null ? null : view.trim();
    }

    @Override
    public String toString() {
        return "Response{" +
                "pid=" + pid +
                ", response='" + response + '\'' +
                ", summary='" + summary + '\'' +
                ", result='" + result + '\'' +
                ", view='" + view + '\'' +
                '}';
    }
}