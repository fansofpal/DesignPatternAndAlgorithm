package com.hdw.decorator;

/**
 * user:hudawei1
 * date:2018/2/7
 * time:16:32
 */
public class ReportA extends ReportDecotator{


    public ReportA(Report report) {
        super(report);
    }

    @Override
    public Object getReportData() {
        String mes = super.getReportData().toString();
        return mes+"扩展了ReportA的数据；";
    }
}
