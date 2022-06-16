package com.linqibin;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.impl.Log4JLogger;
import org.junit.Test;

/**
 *
 * @author lqb
 * @date 2022/6/15
 */
public class JclTest {

    @Test
    public void quickStart() {
        Log log = LogFactory.getLog(JclTest.class);
        log.error("hello");
        Log4JLogger logger = new Log4JLogger();
        System.out.println(logger);
    }
}
