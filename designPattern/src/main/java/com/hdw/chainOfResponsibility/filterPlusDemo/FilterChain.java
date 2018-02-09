package com.hdw.chainOfResponsibility.filterPlusDemo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * user:hudawei1
 * date:2018/2/9
 * time:14:12
 */
public class FilterChain implements Filter{
    public final List<Filter> filterList = new ArrayList<Filter>();

    private int pos = 0;

    public FilterChain addFilter(Filter filter) {
        filterList.add(filter);
        return this;
    }

    /**
     *  为了便于理解，这里特此说明：
     *  1、FilterChain其实没必要继承Filter接口，只是为了多个责任链方便合并在一起才这么设计。故这里的doFilter可以任意取名
     *  2、所以FilterChain里面的doFilter方法里其实没必须传入chain参数。
     *  3、Filter接口里的doFilter方法传入FilterChain是典型的递归操作，pos是递归结束条件。
     *  4、这里使用递归实现了正反责任链。关键代码：chain.doFilter(x,x,x);
     */
    @Override
    public void doFilter(StringBuffer request, StringBuffer response, FilterChain chain) {
        if(pos == filterList.size())
            return;
        filterList.get(pos++).doFilter(request,response,this);
    }
}
