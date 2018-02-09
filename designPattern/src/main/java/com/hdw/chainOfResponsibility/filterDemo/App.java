package com.hdw.chainOfResponsibility.filterDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 责任链模式
 * 这是一种类似于spring中servlet和filter的写法。
 * 使用数组保存所有责任链，使用filterChain传递，在开源框架中，这种写法非常常见。
 * 举例：本例中依然使用责任链，把大象装进冰箱。
 *
 * 其实还有一种基于代理模式的责任链，比较特殊一点。可参考mybatis插件拦截器链的写法。
 * user:hudawei1
 * date:2018/2/9
 * time:9:55
 */
public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args){
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new FirstFilter()).addFilter(new SecondFilter()).addFilter(new ThirdFilter());
        StringBuffer request= new  StringBuffer("把大象装进冰箱：");
        filterChain.doFilter(request);
        log.info(request.toString());
    }

}
