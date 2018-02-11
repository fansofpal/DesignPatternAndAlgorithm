package com.hdw.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * user:hudawei1
 * date:2018/2/11
 * time:17:32
 */
public class File extends Component {
    private static final Logger log = LoggerFactory.getLogger(File.class);

    public File(String name) {
        super(name);
    }

    @Override
    protected Component add(Component component) {
        return null;
    }

    @Override
    protected void del(String name) {

    }

    @Override
    protected List<Component> display() {
        log.info("fileName："+super.name);
        return null;
    }
}
