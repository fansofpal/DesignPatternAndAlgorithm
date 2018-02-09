package com.hdw.chainOfResponsibility.filterPlusDemo;

/**
 * user:hudawei1
 * date:2018/2/9
 * time:14:40
 */
public class SecondFilter implements Filter{

    @Override
    public void doFilter(StringBuffer request, StringBuffer response, FilterChain chain) {
        request.append("把大象塞进冰箱；");
        chain.doFilter(request,response,chain);
        response.append("把大象拉出冰箱；");
    }
}
