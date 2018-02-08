package com.hdw.template;

/**
 * user:hudawei1
 * date:2018/2/8
 * time:16:56
 */
public class ReportB extends AbstractReportTemplate{
    @Override
    public Object search() {
        return "ReportB 完成数据查询；";
    }

    @Override
    public Object sort() {
        return "ReportB完成数据排序；";
    }

    @Override
    public Object calculate() {
        return "ReportB完成数据计算；";
    }
}
