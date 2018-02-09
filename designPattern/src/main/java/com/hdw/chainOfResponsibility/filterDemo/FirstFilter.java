package com.hdw.chainOfResponsibility.filterDemo;

/**
 * user:hudawei1
 * date:2018/2/9
 * time:13:40
 */
public class FirstFilter implements Filter{

    @Override
    public void doFilter(StringBuffer request) {
        request.append("打开冰箱门；");
    }
}
