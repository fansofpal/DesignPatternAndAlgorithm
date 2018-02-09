package com.hdw.chainOfResponsibility.filterDemo;

/**
 * user:hudawei1
 * date:2018/2/9
 * time:13:41
 */
public class SecondFilter implements Filter{
    @Override
    public void doFilter(StringBuffer request) {
        request.append("把大象推进冰箱；");
    }
}
