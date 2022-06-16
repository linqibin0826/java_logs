package com.linqibin;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author lqb
 * @date 2022/6/16
 */
public class Log4j2Test {

    public static final Logger LOGGER =
            LoggerFactory.getLogger(Log4j2Test.class);


    @Test
    public void quickStart() {
        LOGGER.error("error");
        LOGGER.warn("warn");
        LOGGER.info("info");
        LOGGER.debug("debug");
        LOGGER.trace("trace");

    }
}
