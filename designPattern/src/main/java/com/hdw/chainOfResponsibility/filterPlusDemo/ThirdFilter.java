package com.hdw.chainOfResponsibility.filterPlusDemo;

/**
 * user:hudawei1
 * date:2018/2/9
 * time:14:41
 */
public class ThirdFilter implements Filter{
    @Override
    public void doFilter(StringBuffer request, StringBuffer response, FilterChain chain) {
        request.append("关上冰箱门；");
        chain.doFilter(request,response,chain);
        response.append("重新打开冰箱门；");
    }
}
