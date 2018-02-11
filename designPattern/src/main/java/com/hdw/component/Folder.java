package com.hdw.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * user:hudawei1
 * date:2018/2/11
 * time:17:37
 */
public class Folder extends Component{
    private static final Logger log = LoggerFactory.getLogger(Folder.class);
    private List<Component> childList = new ArrayList<Component>();

    public Folder(String name) {
        super(name);
    }

    @Override
    protected Component add(Component component) {
        childList.add(component);
        return this;
    }

    @Override
    protected void del(String name) {

    }

    @Override
    protected List<Component> display() {
        log.info("folderName:"+super.name);
        for(Component c:childList){
            c.display();
        }
        return null;
    }
}
