package com.hdw.chainOfResponsibility.filterDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * user:hudawei1
 * date:2018/2/9
 * time:11:42
 */
public class FilterChain implements Filter{
    public final List<Filter> filterList = new ArrayList<Filter>();


    /**
     * 这种写法是否眼熟，参考建造者模式
     * @param filter
     * @return
     */
    public FilterChain addFilter(Filter filter){
        filterList.add(filter);
        return this;
    }

    @Override
    public void doFilter(StringBuffer request) {
        for(Filter filter : filterList){
            filter.doFilter(request);
        }
    }
}
