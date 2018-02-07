package com.hdw.decorator;

/**
 * user:hudawei1
 * date:2018/2/7
 * time:16:38
 */
public class ReportDecotator implements Report{
    private Report report;

    public ReportDecotator(Report report){
        this.report = report;
    }


    @Override
    public Object getReportData() {
        return report.getReportData();
    }
}
