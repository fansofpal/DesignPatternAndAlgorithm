package com.hdw.template;

/**
 * user:hudawei1
 * date:2018/2/8
 * time:16:48
 */
public abstract class AbstractReportTemplate {

    public abstract Object search();

    public abstract Object sort();

    public abstract Object calculate();

    protected Object getReportData(){
        String search = this.search().toString();
        String sort = this.sort().toString();
        String caculate = this.calculate().toString();
        return search + sort + caculate;
    }
}
