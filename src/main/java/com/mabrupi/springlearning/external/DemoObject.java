package com.mabrupi.springlearning.external;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DemoObject {

    private static final Log log = LogFactory.getLog(DemoObject.class);

    public DemoObject() {
        log.info("Demo object created");
    }

    @Override
    public String toString() {
        return "Demo external object";
    }

}
