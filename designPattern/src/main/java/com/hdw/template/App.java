package com.hdw.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 模板模式
 * 定义好模板抽象类，即把骨架定义好，具体实现交给实现类来处理。
 * 例如: 查询报表数据分为四步：1、查出数据 2、排序 3、计算 4、由模板类统一返回数据结果。
 * 模板已经定义好报表查询处理的流程，不同的报表只需要去做细节的实现就可以了。
 * user:hudawei1
 * date:2018/2/8
 * time:16:00
 */
public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args){
        AbstractReportTemplate reportTemplateA = new ReportA();
        String reportDataA = reportTemplateA.getReportData().toString();
        log.info("reportDataA 获取报表结果："+  reportDataA);

        AbstractReportTemplate reportTemplateB = new ReportB();
        String reportDataB = reportTemplateB.getReportData().toString();
        log.info("reportDataB 获取报表结果："+  reportDataB);

    }
}
