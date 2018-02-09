package com.hdw.chainOfResponsibility.filterPlusDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 责任链模式
 * filterDemo的增强版。在常见的开源框架里，dofilter方法参数通常有三个，其中request和response顺序相反,filterChain用于递归。
 * netty对消息的传递就是可逆的责任链。
 * 举例：把大象塞进冰箱，再取出来。
 * user:hudawei1
 * date:2018/2/9
 * time:14:01
 */
public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);


    public static void main(String[] args){
        FilterChain chain = new FilterChain();
        chain.addFilter(new FirstFilter()).addFilter(new SecondFilter()).addFilter(new ThirdFilter());
        StringBuffer request = new StringBuffer("把大象塞进冰箱：");
        StringBuffer response = new StringBuffer("把大象拉出冰箱：");
        chain.doFilter(request,response,null);
        log.info("正向流程结果："+request.toString());
        log.info("逆向流程结果："+response.toString());
    }
}
