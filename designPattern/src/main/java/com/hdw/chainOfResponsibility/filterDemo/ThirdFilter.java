package com.hdw.chainOfResponsibility.filterDemo;

/**
 * user:hudawei1
 * date:2018/2/9
 * time:13:42
 */
public class ThirdFilter implements Filter{
    @Override
    public void doFilter(StringBuffer request) {
        request.append("关上冰箱门；");
    }
}
