package com.hdw.template;

/**
 * user:hudawei1
 * date:2018/2/8
 * time:16:54
 */
public class ReportA extends AbstractReportTemplate{
    @Override
    public Object search() {
        return "ReportA 完成数据查询；";
    }

    @Override
    public Object sort() {
        return "ReportA完成数据排序；";
    }

    @Override
    public Object calculate() {
        return "ReportA完成数据计算；";
    }
}
