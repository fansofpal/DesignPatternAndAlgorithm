package com.hdw.decorator;

/**
 * user:hudawei1
 * date:2018/2/7
 * time:16:46
 */
public class ReportB extends ReportDecotator{


    public ReportB(Report report) {
        super(report);
    }

    @Override
    public Object getReportData() {
        String mes = super.getReportData().toString();
        return mes+"扩展了ReportB的数据";
    }
}
