package com.hdw.chainOfResponsibility.filterPlusDemo;

/**
 * user:hudawei1
 * date:2018/2/9
 * time:14:12
 */
public interface Filter {


    public void doFilter(StringBuffer request,StringBuffer response,FilterChain chain);
}
