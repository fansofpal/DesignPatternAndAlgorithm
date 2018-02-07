package com.hdw.decorator;

/**
 * user:hudawei1
 * date:2018/2/7
 * time:16:29
 */
public class BaseReport implements Report{

    @Override
    public Object getReportData() {
        return "BaseReport基础报表数据；";
    }
}
