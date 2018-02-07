package com.hdw.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 装饰模式
 * 场景：一张基础报表作为基础数据，各种特色报表基于基础报表做扩展。
 * Report是报表接口，BaseReport是最原始的报表实现类。
 * ReportDecotator是报表装饰类，所有继承了该类的报表类，都具有装饰的特性。
 * （其实所有的报表类只要实现了Report接口，定义一个Report成员变量并通过构造函数传参进去，都可以任意扩展Report对象了。
 * ReportDecotator只是将通用的成员变量和构造函数抽象出来了。）
 * user:hudawei1
 * date:2018/2/7
 * time:16:19
 */
public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args){
        Report reportA = new ReportA(new BaseReport());
        log.info(reportA.getReportData().toString());
        Report reportB = new ReportB(new BaseReport());
        log.info(reportB.getReportData().toString());
        //如果你愿意，可以随意装饰扩展
        Report reportC = new ReportB(new ReportA(new BaseReport()));
        log.info(reportC.getReportData().toString());
    }
}
